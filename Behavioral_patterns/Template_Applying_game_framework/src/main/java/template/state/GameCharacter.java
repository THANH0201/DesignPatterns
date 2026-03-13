package main.java.template.state;

public class GameCharacter {
    private final String name;
    private int cycles;
    private int experience;
    private State state;

    public GameCharacter(String name) {
        this.name = name;
        this.cycles = 0;
        this.experience = 0;
        this.state = new NoviceState();
    }

    public String getName() { return name; }
    public int getCycles() { return cycles; }
    public int getExperience() { return experience; }
    public State getState() { return state; }

    public void addCycle(int amount) {
        this.cycles += amount;
    }

    public void addExperience(int amount) {
        this.experience += amount;
    }

    public void setState(State newState) {
        this.state = newState;
    }

    public void train() {
        state.train(this);
    }


    public void fight() {
        state.fight(this);
    }

    public void printStatus() {
        System.out.println("=== Character Status ===");
        System.out.println("Name: " + name);
        System.out.println("Level: " + state.getLevel());
        System.out.println("Cycles: " + cycles);
        System.out.println("XP: " + experience);
        System.out.println("========================");
    }
}
