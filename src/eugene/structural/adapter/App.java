package eugene.structural.adapter;

/**
 * Created by Jian on 2015/7/28.
 */
/**
 *
 * There are two variations of the Adapter pattern: The class adapter implements
 * the adaptee's interface whereas the object adapter uses composition to
 * contain the adaptee in the adapter object. This example uses the object
 * adapter approach.
 *
 * The Adapter (GnomeEngineer) converts the interface of the target class
 * (GoblinGlider) into a suitable one expected by the client
 * (GnomeEngineeringManager).
 *
 */
public class App {
    public App(){

    }
    public static void main(String[] args){
        Engineer manager = new GnomeEngineeringManager();
        manager.operateDevice();
    }
}
