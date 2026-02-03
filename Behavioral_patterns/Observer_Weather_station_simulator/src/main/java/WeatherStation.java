import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherStation extends Thread implements WeatherSubject {

    private final List<WeatherObserver> observers = new ArrayList<>();
    private final Random random = new Random();

    private int temperature;
    private final int MIN_TEMP = -10;
    private final int MAX_TEMP = 40;

    public WeatherStation() {
        this.temperature = random.nextInt(30); // random initial temp
    }
    @Override
    public void registerObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (WeatherObserver obs : observers) {
            obs.update(temperature);
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep((random.nextInt(5) + 1) * 1000); // 1–5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Change temperature by -1, 0, or +1
            int change = random.nextInt(3) - 1;
            int newTemp = temperature + change;

            // Keep within bounds
            if (newTemp >= MIN_TEMP && newTemp <= MAX_TEMP) {
                temperature = newTemp;
            }

            notifyObservers();
        }
    }
}

