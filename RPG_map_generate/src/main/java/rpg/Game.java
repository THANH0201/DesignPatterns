package rpg;

public class Game {
    public static void main(String[] args) {
        Map map = createMap();
        map.display();
    }
    public static Map createMap() {
        int random = (int) (Math.random() * 2);
        return switch (random) {
            case 0 -> new CityMap(20, 10);//200 tile
            default -> new WildernessMap(20, 10);
        };
    }
}
