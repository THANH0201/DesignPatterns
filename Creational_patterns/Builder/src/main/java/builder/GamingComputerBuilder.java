package main.java.builder;

public class GamingComputerBuilder implements ComputerBuilder {
    private final Computer computer;

    public GamingComputerBuilder() {
        this.computer = new Computer();
    }
    @Override
    public void buildProcessor() {
       computer.setProcessor("Intel i9 / Ryzen 9");
    }
    @Override
    public void buildRAM() {
        computer.setRamSize(32);
    }

    @Override
    public void buildHardDrive() {
        computer.setHardDrive("1 TB SSD");
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicCard("RTX 4080");

    }

    @Override
    public void buildOperatingSystem() {
        computer.setOperatingSystem("Windows 11");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
