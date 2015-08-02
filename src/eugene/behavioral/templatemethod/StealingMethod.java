package eugene.behavioral.templatemethod;

/**
 * Created by Jian on 2015/8/2.
 */
/**
 *
 * StealingMethod defines skeleton for the algorithm.
 *
 */
abstract public class StealingMethod {
    abstract protected String pickTarget();
    abstract protected void confuseTarget(String target);
    abstract protected void stealTheItem(String target);
    public void steal(){
        String target = pickTarget();
        System.out.println("The target has been chosen as " + target + ".");
        confuseTarget(target);
        stealTheItem(target);
    }
}
