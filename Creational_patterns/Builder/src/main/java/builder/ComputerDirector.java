package main.java.builder;

public class ComputerDirector {

    public Computer constructComputer(ComputerBuilder cb) {
        cb.buildProcessor();
        cb.buildRAM();
        cb.buildHardDrive();
        cb.buildGraphicsCard();
        cb.buildOperatingSystem();
        return cb.getComputer();
    }
}
