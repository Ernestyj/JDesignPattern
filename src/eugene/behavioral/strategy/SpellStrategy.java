package eugene.behavioral.strategy;

/**
 * Created by Jian on 2015/8/2.
 */
/**
 *
 * Spell strategy.
 *
 */
public class SpellStrategy implements DragonSlayingStrategy {
    @Override
    public void execute() {
        System.out.println("You cast the spell of disintegration and the dragon vaporizes in a pile of dust!");
    }
}
