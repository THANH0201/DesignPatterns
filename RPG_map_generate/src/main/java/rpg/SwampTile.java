package rpg;

public class SwampTile extends Tile{
    @Override
    public char getCharacter() {
        return 'S';
    }
    @Override
    public String getDiscription() {
        return "Swamp";
    }
    @Override
    public void action() {}
}
