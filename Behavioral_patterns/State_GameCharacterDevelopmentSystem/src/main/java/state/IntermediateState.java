package state;


public class IntermediateState implements State {
    @Override
    public void train(GameCharacter c) {
        System.out.println("Good Training... +10 XP");
        c.addExperience(10);
        if (c.getExperience() >= 30) {
            System.out.println("You advanced to EXPERT level!");
            c.setState(new ExpertState());
        }
    }

    @Override
    public void meditate(GameCharacter c) {
        System.out.println("Good meditating... +10 XP");
        c.addHealth(10);
        if (c.getExperience() >= 30) {
            System.out.println("You advanced to EXPERT level!");
            c.setState(new ExpertState());
        }
    }

    @Override
    public void fight(GameCharacter c) {
        System.out.println("Intermediate cannot fight.");
    }

    @Override
    public String getLevel() {
        return "Intermediate";
    }
}

