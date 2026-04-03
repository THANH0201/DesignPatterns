package FactoryMethod;

public class WildernessMap extends Map {

    public WildernessMap(int height, int width) {
        super(height, width);

        // default: forest
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                tiles[y][x] = new ForestTile();
            }
        }
    }

    @Override
    protected Tile createTile() {
        // abstract
        return new ForestTile();
    }

    // change in time
    public void cycleTile(int x, int y) {
        Tile t = tiles[y][x];

        if (t instanceof ForestTile) {
            tiles[y][x] = new WaterTile();   // Forest → Water
        } else if (t instanceof WaterTile) {
            tiles[y][x] = new SwampTile();   // Water → Swamp
        } else {
            tiles[y][x] = new ForestTile();  // Swamp → Forest
        }
    }
}
