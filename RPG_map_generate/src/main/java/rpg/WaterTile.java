package rpg;

public class WaterTile extends Tile{
    @Override
    public char getCharacter() {
        return 'W';
    }
    @Override
    public String getDiscription() {
        return "Water";
    }
    @Override
    public void action() {}
}