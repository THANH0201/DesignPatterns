package template;

import template.state.GameCharacter;
import template.state.NoviceState;

import java.util.Scanner;

public class ShootCycle extends Game {

    private GameCharacter[] players;
    private boolean gameOver = false;
    private Scanner sc = new Scanner(System.in);

    @Override
    public void initializeGame(int numberOfPlayers) {
        players = new GameCharacter[numberOfPlayers];

        for (int i = 0; i < numberOfPlayers; i++) {
            players[i] = new GameCharacter("Player " + (i + 1));
            players[i].setState(new NoviceState());
            System.out.println(players[i].getName() + " initialized with NoviceState");
        }
    }

    @Override
    public boolean endOfGame() {
        return gameOver;
    }

    @Override
    public void playSingleTurn(int playerIndex) {
        GameCharacter player = players[playerIndex];

        System.out.println("\n--- Turn for " + player.getName() + " ---");
        player.printStatus();

        int actions = 0;

        while (actions < 2) {

            System.out.println("Choose action:");
            System.out.println("1. Train");

            if (player.getCycles() >= 1) {
                System.out.println("2. Fight");
            }

            System.out.println("3. End Turn");
            System.out.print("Your choice: ");

            int choice = Integer.parseInt(sc.nextLine());

            if (choice == 1) {
                player.train();
                actions++;
            }
            else if (choice == 2 && player.getCycles() >= 1) {
                player.fight();
                actions++;
            }
            else if (choice == 3) {
                System.out.println("Ending turn...");
                break;
            }
            else {
                System.out.println("Invalid choice");
                continue;
            }

            if (player.getCycles() <= 0) {
                System.out.println("No cycles left. Ending turn...");
                break;
            }


        }
        System.out.println("Turn ended for " + player.getName());

        if (player.getState().isState()) {
            gameOver = true;

        }
    }


    @Override
    public void displayWinner() {
        GameCharacter winner = players[0];

        for (GameCharacter p : players) {
            if (p.getExperience() > winner.getExperience()) {
                winner = p;
            }
        }

        System.out.println("\n=== GAME OVER ===");
        System.out.println("Winner: " + winner.getName());
        System.out.println("XP: " + winner.getExperience());
    }
}

