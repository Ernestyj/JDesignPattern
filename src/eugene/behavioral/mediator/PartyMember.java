package eugene.behavioral.mediator;

/**
 * Created by Jian on 2015/7/29.
 */
public interface PartyMember {
    void joinedParty(Party party);
    void partyAction(Action action);
    void act(Action action);
}
