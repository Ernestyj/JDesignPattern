package eugene.behavioral.dependencyinjection;

/**
 * Created by Jian on 2015/8/11.
 */
/**
 *
 * Tobacco abstraction
 *
 */
abstract public class Tobacco {
    public void smoke(Wizard wizard){
        System.out.println(String.format("%s smoking %s",
                wizard.getClass().getSimpleName(), this.getClass().getSimpleName()));
    }
}
