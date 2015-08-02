package eugene.behavioral.strategy;

/**
 * Created by Jian on 2015/8/2.
 */
/**
 *
 * DragonSlayer uses different strategies to slay the dragon.
 *
 */
public class DragonSlayer {
    private DragonSlayingStrategy strategy;

    public DragonSlayer(DragonSlayingStrategy strategy) {
        this.strategy = strategy;
    }
    public void changeStrategy(DragonSlayingStrategy strategy){
        this.strategy = strategy;

    }
    public void goToBattle(){
        strategy.execute();
    }
}
