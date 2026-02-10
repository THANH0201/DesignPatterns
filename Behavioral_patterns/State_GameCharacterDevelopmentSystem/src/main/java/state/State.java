package state;
public interface State {
    void train(GameCharacter c);
    void meditate(GameCharacter c);
    void fight(GameCharacter c);
    String getLevel();
    default boolean isState() { return false; }
}
