package eugene.behavioral.strategy;

/**
 * Created by Jian on 2015/8/2.
 */
/**
 *
 * Melee strategy.
 *
 */
public class MeleeStrategy implements DragonSlayingStrategy {
    @Override
    public void execute() {
        System.out.println("With your Excalibur you severe the dragon's head!");
    }
}
