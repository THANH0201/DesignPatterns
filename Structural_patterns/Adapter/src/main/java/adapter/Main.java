package main.java.adapter;

public class Main {
    public static void main(String[] args) {

        NewDateInterface date = new CalendarToNewDateAdapter();

        date.setDay(30);
        date.setMonth(3);
        date.setYear(2026);

        System.out.println("Origin day: " + date);

        date.advanceDays(-10);
        System.out.println("The day 10 days before: " + date);

        date.advanceDays(10);
        System.out.println("The day 10 days later: " + date);

        date.advanceDays(40);
        System.out.println("The day 40 days later: " + date);
    }
}
