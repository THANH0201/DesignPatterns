package template.state;

public class ExpertState implements State {
    @Override
    public void train(GameCharacter c) {
        System.out.println("You train hard. +1 cycle");
        c.addCycle(1);
    }



    @Override
    public void fight(GameCharacter c) {
        int xp = (int)(Math.random() * 3) + 1;
        System.out.println("There are 3 bottles (1, 2, 3 points).");
        System.out.println("You shot a bottle! +" + xp + " XP");
        c.addCycle(-1);
        c.addExperience(xp);
        if (c.getExperience() >= 9) {
            System.out.println("You advanced to MASTER level!");
            c.setState(new MasterState());
        }

    }
    @Override
    public String getLevel() {
        return "Expert";
    }
}

