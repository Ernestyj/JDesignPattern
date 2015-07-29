package eugene.behavioral.mediator;

/**
 * Created by Jian on 2015/7/29.
 */
public interface Party {
    void addMember(PartyMember partyMember);
    void act(PartyMember partyMember, Action action);
}
