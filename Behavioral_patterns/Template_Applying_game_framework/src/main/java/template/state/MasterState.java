package main.java.template.state;

public class MasterState implements State {
    @Override
    public void train(GameCharacter c) {
        System.out.println("Maximum");
    }

    @Override
    public void fight(GameCharacter c) {
        System.out.println("Maximum");
    }

    @Override
    public boolean isState() {
        return true;
    }


    @Override
    public String getLevel() {
        return "Master";
    }
}

