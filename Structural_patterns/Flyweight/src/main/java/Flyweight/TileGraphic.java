package Flyweight;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class TileGraphic {

    private final Image image;

    public TileGraphic(Image image) {
        this.image = image;
    }

    public void draw(GraphicsContext gc, int x, int y, int size) {
        gc.drawImage(image, x, y, size, size);
    }
}
