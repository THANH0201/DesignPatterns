package state;

public class ExpertState implements State {
    @Override
    public void train(GameCharacter c) {
        System.out.println("Good Training... +10 XP");
        c.addHealth(10);
        if (c.getExperience() >= 50) {
            System.out.println("You advanced to MASTER level!");
            c.setState(new MasterState());
        }
    }

    @Override
    public void meditate(GameCharacter c) {
        System.out.println("Good meditating... +10 XP");
        c.addHealth(10);
        if (c.getExperience() >= 50) {
            System.out.println("You advanced to MASTER level!");
            c.setState(new MasterState());
        }
    }

    @Override
    public void fight(GameCharacter c) {
        System.out.println("Good fighting... +10 XP, -10 HP");
        c.addHealth(-10);
        c.addExperience(10);
        if (c.getExperience() >= 50) {
            System.out.println("You advanced to MASTER level!");
            c.setState(new MasterState());
        }
    }

    @Override
    public String getLevel() {
        return "Expert";
    }
}

