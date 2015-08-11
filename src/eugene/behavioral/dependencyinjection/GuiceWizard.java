package eugene.behavioral.dependencyinjection;

import javax.inject.Inject;
/**
 * Created by Jian on 2015/8/11.
 */
/**
 *
 * GuiceWizard implements inversion of control.
 * Its dependencies are injected through its constructor
 * by Guice framework.
 *
 */
public class GuiceWizard implements Wizard {
    private Tobacco tobacco;

    @Inject
    public GuiceWizard(Tobacco tobacco) {
        this.tobacco = tobacco;
    }

    @Override
    public void smoke() {
        tobacco.smoke(this);
    }
}
