package eugene.structural.eventaggregator;

/**
 * Created by Jian on 2015/8/12.
 */
/**
 *
 * Observers of events implement this interface.
 *
 */
public interface EventObserver {
    void onEvent(Event e);
}
