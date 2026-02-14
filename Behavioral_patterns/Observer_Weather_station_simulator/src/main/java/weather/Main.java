package main.java.weather;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        WeatherObserver ob1 = new Observer1("Observer 1");
        WeatherObserver ob2 = new Observer2("Observer 2");
        WeatherObserver ob3 = new Observer3("Observer 3");

        weatherStation.registerObserver(ob1);
        weatherStation.registerObserver(ob2);
        weatherStation.registerObserver(ob3);

        weatherStation.start();

        try {
            Thread.sleep(10000); // run 10 seconds
        } catch (InterruptedException e)
            { e.printStackTrace();
            }
        System.out.println("\n--- Removing Observer 1 ---\n");

        weatherStation.removeObserver(ob1);

        // Let simulation continue
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e)
            { e.printStackTrace();
            }

        System.out.println("\nSimulation ended.");
        System.exit(0);


    }
}
