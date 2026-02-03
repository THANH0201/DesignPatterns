public class Observer2 implements WeatherObserver {
    private String name;

    public Observer2(String name) {
        this.name = name;
    }

    @Override
    public void update(int temperature) {
        System.out.println(name + " Current temperature = " + temperature);
    }
}
