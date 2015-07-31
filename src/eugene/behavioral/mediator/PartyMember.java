package eugene.behavioral.mediator;

/**
 * Created by Jian on 2015/7/29.
 */
/**
 *
 * Interface for party members interacting with Party.
 *
 */
public interface PartyMember {
    void joinedParty(Party party);
    void partyAction(Action action);
    void act(Action action);
}
