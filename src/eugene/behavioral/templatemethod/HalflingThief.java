package eugene.behavioral.templatemethod;

/**
 * Created by Jian on 2015/8/2.
 */
/**
 *
 * Halfling thief uses StealingMethod to steal.
 *
 */
public class HalflingThief {
    private StealingMethod method;

    public HalflingThief(StealingMethod method) {
        this.method = method;
    }

    public void steal(){
        method.steal();
    }

    public void changeMethod(StealingMethod method){
        this.method = method;
    }
}
