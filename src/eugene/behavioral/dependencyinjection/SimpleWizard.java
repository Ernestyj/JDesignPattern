package eugene.behavioral.dependencyinjection;

/**
 * Created by Jian on 2015/8/11.
 */
/**
 *
 * Naive Wizard implementation violating the inversion of control principle.
 * It should depend on abstraction instead.
 *
 */
public class SimpleWizard implements Wizard {

    private OldTobyTobacco tobacco = new OldTobyTobacco();

    @Override
    public void smoke() {
        tobacco.smoke(this);
    }
}
