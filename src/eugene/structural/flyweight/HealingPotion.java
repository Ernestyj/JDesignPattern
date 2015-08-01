package eugene.structural.flyweight;

/**
 * Created by Jian on 2015/8/1.
 */
public class HealingPotion implements Potion {
    @Override
    public void drink() {
        System.out.println("You feel healed. (Potion="
                + System.identityHashCode(this) + ")");
    }
}
