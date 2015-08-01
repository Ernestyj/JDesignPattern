package eugene.creational.abstractfactory;

/**
 * Created by Jian on 2015/8/1.
 */
/**
 *
 * Concrete factory.
 *
 */
public class OrcKingdomFactory implements KingdomFactory {
    @Override
    public Castle createCastle() {
        return new OrcCastle();
    }

    @Override
    public King createKing() {
        return new OrcKing();
    }

    @Override
    public Army createArmy() {
        return new OrcArmy();
    }
}
