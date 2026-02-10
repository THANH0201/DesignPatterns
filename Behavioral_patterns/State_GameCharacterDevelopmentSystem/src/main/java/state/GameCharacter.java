package state;

public class GameCharacter {
    private String name;
    private int health;
    private int experience;
    private State state;

    public GameCharacter(String name) {
        this.name = name;
        this.health = 100;
        this.experience = 0;
        this.state = new NoviceState(); // bắt đầu ở Novice
    }

    public String getName() { return name; }
    public int getHealth() { return health; }
    public int getExperience() { return experience; }
    public State getState() { return state; }

    public void addHealth(int amount) {
        this.health += amount;
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

    public void meditate() {
        state.meditate(this);
    }

    public void fight() {
        state.fight(this);
    }

    public void printStatus() {
        System.out.println("=== Character Status ===");
        System.out.println("Name: " + name);
        System.out.println("Level: " + state.getLevel());
        System.out.println("HP: " + health);
        System.out.println("XP: " + experience);
        System.out.println("========================");
    }
}
