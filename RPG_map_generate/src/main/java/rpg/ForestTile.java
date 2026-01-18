package rpg;

public class ForestTile extends Tile{
    @Override
    public char getCharacter() {
        return 'F';
    }
    @Override
    public String getDiscription() {
        return "Forest";
    }
    @Override
    public void action() {}
}
