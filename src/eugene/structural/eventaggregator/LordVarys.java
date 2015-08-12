package eugene.structural.eventaggregator;

/**
 * Created by Jian on 2015/8/12.
 */
/**
 *
 * LordVarys produces events.
 *
 */
public class LordVarys extends EventEmitter {
    public LordVarys() {
        super();
    }

    public LordVarys(EventObserver obs) {
        super(obs);
    }
    @Override
    public void timePasses(Weekday day) {
        if (day.equals(Weekday.SATURDAY)) {
            notifyObservers(Event.TRAITOR_DETECTED);
        }
    }
}
