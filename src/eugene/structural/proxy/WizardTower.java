package eugene.structural.proxy;

/**
 * Created by Jian on 2015/7/31.
 */
/**
 *
 * The object to be proxyed.
 *
 */
public class WizardTower {
    public WizardTower() {
    }

    public void enter(Wizard wizard){
        System.out.println(wizard + " enters the tower.");
    }
}
