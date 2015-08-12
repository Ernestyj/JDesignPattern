package eugene.structural.eventaggregator;

/**
 * Created by Jian on 2015/8/12.
 */
/**
 *
 * KingJoffrey observes events from KingsHand.
 *
 */
public class KingJoffrey implements EventObserver {
    @Override
    public void onEvent(Event e) {
        System.out.println("Received event from the King's Hand: " + e.toString());
    }
}
