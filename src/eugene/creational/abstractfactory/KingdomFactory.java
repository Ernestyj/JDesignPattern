package eugene.creational.abstractfactory;

/**
 * Created by Jian on 2015/8/1.
 */
/**
 *
 * The factory interface.
 *
 */
public interface KingdomFactory {
    public Castle createCastle();
    public King createKing();
    public Army createArmy();
}
