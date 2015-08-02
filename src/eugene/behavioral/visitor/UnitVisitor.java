package eugene.behavioral.visitor;

/**
 * Created by Jian on 2015/8/2.
 */
/**
 *
 * Visitor interface.
 *
 */
public interface UnitVisitor {
    void visitSoldier(Soldier soldier);
    void visitSergeant(Sergeant sergeant);
    void visitCommander(Commander commander);
}
