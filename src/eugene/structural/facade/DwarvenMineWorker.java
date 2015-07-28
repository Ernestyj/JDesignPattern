package eugene.structural.facade;

/**
 * Created by Jian on 2015/7/28.
 */
/**
 *
 * DwarvenMineWorker is one of the goldmine subsystems.
 *
 */
/**
 *
 * DwarvenTunnelDigger is one of the goldmine subsystems.
 *
 */
abstract public class DwarvenMineWorker {
    public DwarvenMineWorker(){

    }
    public void goToSleep(){
        System.out.println(name() + " goes to sleep.");
    }
    public void wakeUp(){
        System.out.println(name() + " wakes up.");
    }
    public void goHome(){
        System.out.println(name() + " goes home.");
    }
    public void goToMine(){
        System.out.println(name() + " goes to the mine.");
    }

    abstract public void work();
    abstract public String name();

    private void action(Action action) {
        switch (action) {
            case GO_TO_SLEEP:
                goToSleep();
                break;
            case WAKE_UP:
                wakeUp();
                break;
            case GO_HOME:
                goHome();
                break;
            case GO_TO_MINE:
                goToMine();
                break;
            case WORK:
                work();
                break;
            default:
                System.out.println("Undefined action");
                break;
        }
    }

    public void action(Action... actions) {
        for (Action action : actions) {
            action(action);
        }
    }

    static enum Action {
        GO_TO_SLEEP, WAKE_UP, GO_HOME, GO_TO_MINE, WORK
    }

}
