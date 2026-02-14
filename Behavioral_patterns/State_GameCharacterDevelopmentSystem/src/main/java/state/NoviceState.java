package main.java.state;

public class NoviceState implements State {
    @Override
    public void train(GameCharacter c) {
        System.out.println("You train hard. +10 XP");
        c.addExperience(10);
        if (c.getExperience() >= 10) {
            System.out.println("You advanced to INTERMEDIATE level!");
            c.setState(new IntermediateState());
        }
    }

    @Override
    public void meditate(GameCharacter c) {
        System.out.println("Novice cannot meditate.");
    }

    @Override
    public void fight(GameCharacter c) {
        System.out.println("Novice cannot fight.");
    }

    @Override
    public String getLevel() {
        return "Novice";
    }
}

