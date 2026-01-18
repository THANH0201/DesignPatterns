package rpg;

public abstract class Map {
    protected Tile[][] tiles;
    public Map(int height, int width) {
        tiles = new Tile[height][width];
        generate();
    }
    protected abstract Tile createTile(); //Factory method
    public void generate() {
        for(int i=0; i < tiles.length; i++) {
            for(int j=0; j < tiles[i].length; j++) {
                tiles[i][j] = createTile();
            }
        }
    }
    public void display() {
        for(Tile[] row: tiles) {
            for(Tile tile: row) {
                System.out.print(tile.getCharacter());
            }
            System.out.println();
        }
    }
}
