package Flyweight;

import FactoryMethod.Game;
import FactoryMethod.Map;
import FactoryMethod.WildernessMap;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.concurrent.atomic.AtomicReference;

public class GameDemo extends Application {
    private int currentX = 0;
    private int currentY = 0;

    @Override
    public void start(Stage stage) {
        int tileSize = 32;

        // first map
        AtomicReference<Map> map = new AtomicReference<>(Game.createMap());

        Canvas canvas = new Canvas(map.get().getWidth() * tileSize, map.get().getHeight() * tileSize);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        MapRender render = new MapRender(tileSize);
        render.render(gc, map.get());

        // Timeline 1: WildernessMap tile animation (in order)
        Timeline tileTimeline = new Timeline(new KeyFrame(Duration.seconds(0.025), e -> {

            Map currentMap = map.get();

            if (currentMap instanceof WildernessMap wild) {

                wild.cycleTile(currentX, currentY);

                currentX++;
                if (currentX >= currentMap.getWidth()) {
                    currentX = 0;
                    currentY++;
                }
                if (currentY >= currentMap.getHeight()) {
                    currentY = 0;
                }
            }

            render.render(gc, currentMap);
        }));
        tileTimeline.setCycleCount(Timeline.INDEFINITE);
        tileTimeline.play();


        // Timeline 2: Switch between CityMap and WildernessMap
        Timeline switchTimeline = new Timeline(new KeyFrame(Duration.seconds(5), e -> {

            // create new map
            map.set(Game.createMap());

            // reset animation position
            currentX = 0;
            currentY = 0;

            // resize canvas if needed
            canvas.setWidth(map.get().getWidth() * tileSize);
            canvas.setHeight(map.get().getHeight() * tileSize);

            render.render(gc, map.get());
        }));
        switchTimeline.setCycleCount(Timeline.INDEFINITE);
        switchTimeline.play();


        stage.setScene(new Scene(new StackPane(canvas)));
        stage.setTitle("Flyweight Map Demo");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
