package Flyweight;

import FactoryMethod.Map;
import FactoryMethod.Tile;
import javafx.scene.canvas.GraphicsContext;

public class MapRender {

    private final int tileSize;

    public MapRender(int tileSize) {
        this.tileSize = tileSize;
    }

    public void render(GraphicsContext gc, Map map) {
        gc.clearRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());

        for (int y = 0; y < map.getHeight(); y++) {
            for (int x = 0; x < map.getWidth(); x++) {
                Tile tile = map.getTile(x, y);
                TileGraphic graphic = TileGraphicFactory.getGraphic(tile.getType());
                graphic.draw(gc, x * tileSize, y * tileSize, tileSize);
            }
        }
    }

}
