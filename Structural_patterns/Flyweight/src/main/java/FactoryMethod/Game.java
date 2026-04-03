package FactoryMethod;

public class Game {
    public static void main(String[] args) {
        Map map = createMap();
        map.display();
    }
    public static Map createMap() {
        int random = (int) (Math.random() * 2);
        return switch (random) {
            case 0 -> new CityMap(20, 20);
            default -> new WildernessMap(20, 20);
        };
    }

}
