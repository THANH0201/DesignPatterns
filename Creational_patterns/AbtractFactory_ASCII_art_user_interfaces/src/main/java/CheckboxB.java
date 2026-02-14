package main.java;

import main.java.Checkbox;

public class CheckboxB extends Checkbox {
    public CheckboxB(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("(x)" +text );
    }
}
