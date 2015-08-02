package eugene.behavioral.strategy;

/**
 * Created by Jian on 2015/8/2.
 */
/**
 *
 * Projectile strategy.
 *
 */
public class ProjectileStrategy implements DragonSlayingStrategy {
    @Override
    public void execute() {
        System.out.println("You shoot the dragon with the magical crossbow and it falls dead on the ground!");
    }
}
