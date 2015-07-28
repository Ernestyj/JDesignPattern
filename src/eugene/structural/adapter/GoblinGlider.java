package eugene.structural.adapter;

/**
 * Created by Jian on 2015/7/28.
 */
/**
 *
 * Device class (adaptee in the pattern).
 *
 */
public class GoblinGlider {
    public GoblinGlider(){
    }
    public void attachGlider(){
        System.out.println("Glider attached.");
    }
    public void gainSpeed(){
        System.out.println("Gaining speed.");
    }
    public void takeOff(){
        System.out.println("Lift-off!");
    }
}
