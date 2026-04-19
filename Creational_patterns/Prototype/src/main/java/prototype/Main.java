package main.java.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Recommendation> recommendations = new ArrayList<>();

    public static void main(String[] args) {

        seedData();

        while (true) {
            System.out.println("\n=== BOOK RECOMMENDATION SYSTEM ===");
            System.out.println("1. View recommendations");
            System.out.println("2. Clone a recommendation");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> viewRecommendations();
                case "2" -> cloneRecommendation();
                case "3" -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }

    private static void seedData() {
        List<Book> teenBooks = new ArrayList<>();
        teenBooks.add(new Book("J.K. Rowling", "Harry Potter", "Fantasy", "1997"));
        teenBooks.add(new Book("Rick Riordan", "Percy Jackson", "Fantasy", "2005"));

        recommendations.add(new Recommendation("Teen Readers", teenBooks));

        List<Book> adultBooks = new ArrayList<>();
        adultBooks.add(new Book("George Orwell", "1984", "Dystopia", "1949"));
        adultBooks.add(new Book("Yuval Noah Harari", "Sapiens", "History", "2011"));

        recommendations.add(new Recommendation("Adult Readers", adultBooks));
    }

    private static void viewRecommendations() {
        System.out.println("\n--- RECOMMENDATIONS ---");
        for (int i = 0; i < recommendations.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + "Audience: " + recommendations.get(i).getTargetAudience());
            for (Book b : recommendations.get(i).getBooks()) {
                System.out.println("   - " + b.getTitle() + " by " + b.getAuthor());
            }
        }
    }

    private static void cloneRecommendation() {
        System.out.print("Enter number to clone: ");
        int index = Integer.parseInt(scanner.nextLine());
        int number = index - 1;

        if ((number) < 0 || number >= recommendations.size()) {
            System.out.println("Invalid index");
            return;
        }

        Recommendation cloned = recommendations.get(number).clone();

        System.out.print("New target audience: ");
        cloned.setTargetAudience(scanner.nextLine());

        while (true) {
            System.out.print("Add a book to cloned list? (y/n): ");
            if (!scanner.nextLine().equalsIgnoreCase("y")) break;

            System.out.print("Author: ");
            String author = scanner.nextLine();

            System.out.print("Title: ");
            String title = scanner.nextLine();

            System.out.print("Genre: ");
            String genre = scanner.nextLine();

            System.out.print("Publication year: ");
            String year = scanner.nextLine();

            cloned.addBook(new Book(author, title, genre, year));
        }

        recommendations.add(cloned);
        System.out.println("Cloned and saved successfully!");
    }
}
