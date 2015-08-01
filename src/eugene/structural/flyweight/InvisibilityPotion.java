package eugene.structural.flyweight;

/**
 * Created by Jian on 2015/8/1.
 */
public class InvisibilityPotion implements Potion {
    @Override
    public void drink() {
        System.out.println("You become invisible. (Potion="
                + System.identityHashCode(this) + ")");
    }
}
