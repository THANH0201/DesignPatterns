package state;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter character name: ");
        String name = sc.nextLine();

        GameCharacter c = new GameCharacter(name);

        System.out.println("\nWelcome, " + name + "! Your journey begins...\n");

        while (true) {
            c.printStatus();

            // If master -> end game
            if (c.getState().isState()) {
                System.out.println("You have reached MASTER level. Game Over!");
                break;
            }

            System.out.println("Enter number to choose action:");
            System.out.println("1. Train");
            System.out.println("2. Meditate");
            System.out.println("3. Fight");
            System.out.print("Your choice: ");

            int choice = -1;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input.");
                continue;
            }

            System.out.println();

            switch (choice) {
                case 1:
                    c.train();
                    break;
                case 2:
                    c.meditate();
                    break;
                case 3:
                    c.fight();
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

            System.out.println("\n--------------------------------------\n");
        }

        sc.close();
    }
}
