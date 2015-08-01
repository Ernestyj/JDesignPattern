package eugene.structural.flyweight;

/**
 * Created by Jian on 2015/8/1.
 */
public class StrengthPotion implements Potion {
    @Override
    public void drink() {
        System.out.println("You feel strong. (Potion="
                + System.identityHashCode(this) + ")");
    }
}
