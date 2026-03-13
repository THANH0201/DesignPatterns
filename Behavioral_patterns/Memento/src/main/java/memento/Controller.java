package main.java.memento;

import javafx.scene.Scene;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Controller {
    private Model model;
    private Gui gui;
    private final List<IMemento> history; // Memento history
    private final Stack<IMemento> undoList = new  Stack<>();
    private final Stack<IMemento> redoList = new  Stack<>();

    public Controller(Gui gui) {
        this.model = new Model();
        this.gui = gui;
        this.history = new ArrayList<>();
    }

    private void saveToHistory() {
        IMemento currentState = model.createMemento();
        history.add(currentState);
        undoList.push(currentState);
        redoList.clear();
    }
    // select color
    public void setOption(int optionNumber, int choice) {
        model.setOption(optionNumber, choice);
        saveToHistory();
    }

    public int getOption(int optionNumber) {
        return model.getOption(optionNumber);
    }

    public void setIsSelected(boolean isSelected) {
        model.setIsSelected(isSelected);
        saveToHistory();
    }

    public boolean getIsSelected() {
        return model.getIsSelected();
    }

    public void undo() {
        if (undoList.size() <= 1) return;

        IMemento current = undoList.pop();
        redoList.push(current);

        IMemento previousState = undoList.peek();
        model.restoreState(previousState);
        gui.updateGui();
    }
    public void redo() {
        if (redoList.isEmpty()){
            System.out.println("No more options to redo");
            return;
        };
        IMemento redo = redoList.pop();
        undoList.push(redo);

        model.restoreState(redo);
        gui.updateGui();
    }

    // history window
    public void openHistoryWindow() {
        Stage stage = new Stage();
        stage.setTitle("History");

        ListView<IMemento> listView = new ListView<>();
        listView.getItems().addAll(history);

        // Display metadata of memento
        listView.setCellFactory(param -> new ListCell<>() {
            @Override
            protected void updateItem(IMemento item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) {
                    setText(null);
                } else {
                    setText(item.getTime() + " | " + item.getDescription());
                }
            }
        });

        // user click  state → restore
        listView.setOnMouseClicked(event -> {
            IMemento selected = listView.getSelectionModel().getSelectedItem();
            if (selected != null) {
                model.restoreState(selected);
                gui.updateGui();
            }
        });

        VBox root = new VBox(listView);
        Scene scene = new Scene(root, 350, 400);
        stage.setScene(scene);
        stage.show();
    }
}