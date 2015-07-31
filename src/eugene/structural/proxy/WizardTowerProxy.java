package eugene.structural.proxy;

/**
 * Created by Jian on 2015/7/31.
 */
/**
 *
 * The proxy controlling access to WizardTower.
 *
 */
public class WizardTowerProxy extends WizardTower{
    private static final int NUM_WIZARDS_ALLOWED = 3;
    private int numWizards;

    @Override
    public void enter(Wizard wizard) {
        if (numWizards < NUM_WIZARDS_ALLOWED) {
            super.enter(wizard);
            numWizards++;
        } else {
            System.out.println(wizard + " is not allowed to enter!");
        }
    }

}
