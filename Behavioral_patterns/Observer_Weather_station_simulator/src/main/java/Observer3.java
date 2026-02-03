public class Observer3 implements WeatherObserver {
    private String name;

    public Observer3(String name) {
        this.name = name;
    }

    @Override
    public void update(int temperature) {
        System.out.println(name + " Current temperature = " + temperature);
    }
}
