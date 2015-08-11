package eugene.creational.objectpool;

/**
 * Created by Jian on 2015/8/11.
 */
/**
 *
 * Oliphaunt object pool
 *
 */
public class OliphauntPool extends ObjectPool<Oliphaunt> {
    @Override
    protected Oliphaunt create() {
        return new Oliphaunt();
    }
}
