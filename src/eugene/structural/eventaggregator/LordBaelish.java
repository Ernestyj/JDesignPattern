package eugene.structural.eventaggregator;

/**
 * Created by Jian on 2015/8/12.
 */
/**
 *
 * LordBaelish produces events.
 *
 */
public class LordBaelish extends EventEmitter {
    public LordBaelish() {
        super();
    }

    public LordBaelish(EventObserver obs) {
        super(obs);
    }

    @Override
    public void timePasses(Weekday day) {
        if (day.equals(Weekday.FRIDAY)) {
            notifyObservers(Event.STARK_SIGHTED);
        }
    }
}
