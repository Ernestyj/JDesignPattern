package eugene.structural.facade;

/**
 * Created by Jian on 2015/7/28.
 */
/**
 *
 * Facade (DwarvenGoldmineFacade) provides simpler interface to subsystem.
 * http://en.wikipedia.org/wiki/Facade_pattern
 *
 */
public class App {
    public App(){

    }
    public static void main(String[] args){
        DwarvenGoldmineFacade facade = new DwarvenGoldmineFacade();
        facade.startNewDay();
        facade.digOutGold();
        facade.endDay();
    }
}
