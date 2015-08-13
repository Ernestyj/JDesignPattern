package eugene.concurrency.threadpool;

/**
 * Created by Jian on 2015/8/13.
 */
/**
 *
 * CoffeeMakingTask is a concrete task
 *
 */
public class CoffeeMakingTask extends Task {
    private static final int TIME_PER_CUP = 300;

    protected CoffeeMakingTask(int numCups) {
        super(numCups * TIME_PER_CUP);
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.getClass().getSimpleName(), super.toString());
    }
}
