package FactoryMethod;

public abstract class Map {
    protected Tile[][] tiles;
    protected int width;
    protected int height;

    public Map(int height, int width) {
        this.height = height;
        this.width = width;
        tiles = new Tile[height][width];

        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
                tiles[h][w] = createTile(); // factory method
            }
        }
    }
    public Tile getTile(int x, int y) {
        return tiles[y][x];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
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
