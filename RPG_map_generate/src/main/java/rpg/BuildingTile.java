package rpg;

public class BuildingTile extends Tile{
    @Override
    public char getCharacter() {
        return 'B';
    }
    @Override
    public String getDiscription() {
        return "Building";
    }
    @Override
    public void action() {}
}
