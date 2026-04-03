package FactoryMethod;

public class CityMap extends Map {

    public CityMap(int height, int width) {
        super(height, width);

        // quadrant: 10x10
        int halfH = height / 2; // 10
        int halfW = width / 2;  // 10

        // Scan map
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                // confirm quadrant
                int localY = y % halfH;  // 0–9
                int localX = x % halfW;  // 0–9

                int midY = halfH / 2;    // 5
                int midX = halfW / 2;    // 5

                // 1) y road in quadrant
                if (localX == midX) {
                    tiles[y][x] = new RoadTile();
                    continue;
                }

                // 2) x road in quadrant
                if (localY == midY) {
                    tiles[y][x] = new RoadTile();
                    continue;
                }

                // 3) building (±1 tile)
                boolean nearVerticalRoad = Math.abs(localX - midX) <= 1;
                boolean nearHorizontalRoad = Math.abs(localY - midY) <= 1;

                if (nearVerticalRoad || nearHorizontalRoad) {
                    tiles[y][x] = new BuildingTile();
                    continue;
                }

                // 4) forest
                tiles[y][x] = new ForestTile();
            }
        }
    }

    @Override
    protected Tile createTile() {
        return new ForestTile();
    }
}
