package main.java.builder;

public class OfficeComputerBuilder implements ComputerBuilder {
    private final Computer computer;

    public OfficeComputerBuilder() {
        this.computer = new Computer();
    }
    @Override
    public void buildProcessor() {
        computer.setProcessor("Intel 15");
    }
    @Override
    public void buildRAM() {
        computer.setRamSize(16);
    }

    @Override
    public void buildHardDrive() {
        computer.setHardDrive("512 GB SSD");
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicCard("integrate");

    }

    @Override
    public void buildOperatingSystem() {
        computer.setOperatingSystem("Windows 11/Linux");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
