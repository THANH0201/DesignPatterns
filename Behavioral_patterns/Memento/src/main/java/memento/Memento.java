package main.java.memento;

public class Memento implements IMemento {
    private int[] options;
    private boolean isSelected;
    private String time;

    public Memento(int[] options, boolean isSelected) {
        this.options = options.clone(); // Copy options array
        this.isSelected = isSelected;
        this.time = java.time.LocalTime.now().toString();

        System.out.println("Memento created");
    }

    public int[] getOptions() {
        return options;
    }

    public boolean isSelected() {
        return isSelected;
    }

    @Override
    public String getTime() {
        return time;
    }

    @Override
    public String getDescription() {
        return "Colors: "
                + colorName(options[0]) + ", "
                + colorName(options[1]) + ", "
                + colorName(options[2])
                + " | CheckBox: " + (isSelected ? "Checked" : "Unchecked");
    }

    private String colorName(int code) {
        return switch (code) {
            case 0 -> "Red";
            case 1 -> "Blue";
            case 2 -> "Yellow";
            default -> "No color";
        };
    }
}