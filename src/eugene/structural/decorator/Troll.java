package eugene.structural.decorator;

/**
 * Created by Jian on 2015/8/2.
 */
/**
 *
 * Troll implements Hostile interface directly.
 *
 */
public class Troll implements Hostile {
    @Override
    public void attack() {
        System.out.println("The troll swings at you with a club!");
    }

    @Override
    public void fleeBattle() {
        System.out.println("The troll shrieks in horror and runs away!");
    }
}
