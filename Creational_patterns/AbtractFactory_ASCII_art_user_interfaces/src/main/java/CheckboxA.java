package main.java;

import main.java.Checkbox;

public class CheckboxA extends Checkbox {
    public CheckboxA(String text) {
        super(text);
    }

    @Override
    public void display() {
       System.out.println("[x]" +text );
    }
}
