package eugene.creational.singleton;

/**
 * Created by Jian on 2015/7/29.
 */
/**
 *
 * Singleton class.
 * Eagerly initialized static instance guarantees thread
 * safety.
 *
 */
public class IvoryTower {
    private static IvoryTower instance = new IvoryTower();

    private IvoryTower(){}

    public static IvoryTower getInstance(){
        return instance;
    }
}
