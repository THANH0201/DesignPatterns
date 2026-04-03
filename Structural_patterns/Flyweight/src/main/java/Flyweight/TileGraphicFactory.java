package Flyweight;

import javafx.scene.image.Image;

import java.util.HashMap;
import java.util.Map;

public class TileGraphicFactory {

    private static final Map<String, TileGraphic> CACHE = new HashMap<>();

    public static TileGraphic getGraphic(String type) {
        return CACHE.computeIfAbsent(type, TileGraphicFactory::createGraphic);
    }

    private static TileGraphic createGraphic(String type) {
        String path = "/images/" + type + ".png";
        var stream = TileGraphicFactory.class.getResourceAsStream(path);

        if (stream == null) {
            System.out.println("image not found: " + path);
        }

        return new TileGraphic(new Image(stream));
    }

}
