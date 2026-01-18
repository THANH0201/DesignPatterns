package rpg;

public class CityMap extends Map {
    public CityMap(int height, int width) {
        super(height, width);
    }
    @Override
    protected Tile createTile() {
        int random = (int) (Math.random() * 3);
        return switch (random) {
            case 0 -> new RoadTile();
            case 1 -> new ForestTile();
            default -> new BuildingTile();
        };
    }
}
