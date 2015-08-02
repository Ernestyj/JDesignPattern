package eugene.behavioral.visitor;

/**
 * Created by Jian on 2015/8/2.
 */
/**
 *
 * Interface for the nodes in hierarchy.
 *
 */
abstract public class Unit {
    private Unit[] children;

    public Unit(Unit... children){
        this.children = children;
    }

    public void accept(UnitVisitor visitor){
        for (Unit child : children) {
            child.accept(visitor);
        }
    }
}
