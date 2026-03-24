package main.java.builder;

public class Computer {
    public String processor;
    public int ramSize;
    public String hardDrive;
    public String graphicCard;
    public String operatingSystem;

    //getter
    public String getProcessor() {
        return processor;
    }
    public int getRamSize() {
        return ramSize;
    }

    public String getHardDrive(String s) {
        return hardDrive;
    }
    public String getGraphicCard() {
        return graphicCard;
    }
    public String getOperatingSystem() {
        return operatingSystem;
    }
    //settet
    public void setProcessor(String processor) {
        this.processor = processor;
    }
    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }
    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    @Override
    public String toString() {
        return  "Processor:'" + processor + '\'' +
                ", RAM size:'" + ramSize + " GB" +
                ", Hard Drive:'" + hardDrive + '\'' +
                ", Graphics Card:'" + graphicCard + '\'' +
                ", Operating System:'" + operatingSystem + '\'';
    }
}
