package main.java.builder;

public class Main {
    public static void main(String[] args) {

        ComputerDirector director = new ComputerDirector();

        Computer officeCp = director.constructComputer(new OfficeComputerBuilder());
        System.out.println("Office Computer");
        System.out.println(officeCp);

        Computer gamCp = director.constructComputer(new GamingComputerBuilder());
        System.out.println("Gaming Computer");
        System.out.println(gamCp);

    }
}
