package eugene.creational.abstractfactory;

/**
 * Created by Jian on 2015/8/1.
 */
/**
 *
 * Concrete factory.
 *
 */
public class ElfKingdomFactory implements KingdomFactory {
    @Override
    public Castle createCastle() {
        return new ElfCastle();
    }

    @Override
    public King createKing() {
        return new ElfKing();
    }

    @Override
    public Army createArmy() {
        return new ElfArmy();
    }
}
