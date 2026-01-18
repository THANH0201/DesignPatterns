package rpg;

public abstract class Map {
    protected Tile[][] tiles;
    protected int width;
    protected int height;

    public Map(int width, int height) {
        this.width = width;
        this.height = height;
        tiles = new Tile[height][width];

        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
                tiles[h][w] = createTile(); // factory method
            }
        }
    }

    protected abstract Tile createTile(); // factory method

    public void display() {
        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
                System.out.print(tiles[h][w].getCharacter() + " ");
            }
            System.out.println();
        }
    }
}
