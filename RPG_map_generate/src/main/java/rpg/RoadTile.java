package rpg;

public class RoadTile extends Tile{
    @Override
    public char getCharacter() {
        return 'R';
    }
    @Override
    public String getDiscription() {
        return "Road";
    }
    @Override
    public void action() {}
}
