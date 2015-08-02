package eugene.behavioral.command;

/**
 * Created by Jian on 2015/8/2.
 */
/**
 *
 * Goblin is the target of the spells
 *
 */
public class Goblin extends Target {
    public Goblin() {
        setSize(Size.NORMAL);
        setVisibility(Visibility.VISIBLE);
    }

    @Override
    public String toString() {
        return "Goblin";
    }
}
