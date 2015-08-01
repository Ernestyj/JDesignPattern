package eugene.structural.flyweight;

/**
 * Created by Jian on 2015/8/1.
 */
public class PoisonPotion implements Potion {
    @Override
    public void drink() {
        System.out.println("Urgh! This is poisonous. (Potion="
                + System.identityHashCode(this) + ")");
    }
}
