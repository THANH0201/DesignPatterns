package rpg;

public class WildernessMap extends Map {
    public WildernessMap(int height, int width) {
        super(height, width);
    }
    @Override
    protected Tile createTile() {
        int random = (int) (Math.random() * 3);
        return switch (random) {
            case 0 -> new SwampTile();
            case 1 -> new WaterTile();
            default -> new ForestTile();
        };
    }
}

