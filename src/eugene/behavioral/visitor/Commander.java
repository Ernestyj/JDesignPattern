package eugene.behavioral.visitor;

/**
 * Created by Jian on 2015/8/2.
 */
/**
 *
 * Commander
 *
 */
public class Commander extends Unit {
    public Commander(Unit... children) {
        super(children);
    }

    @Override
    public void accept(UnitVisitor visitor) {
        visitor.visitCommander(this);
        super.accept(visitor);
    }

    @Override
    public String toString() {
        return "commander";
    }
}
