package eugene.behavioral.mediator;

/**
 * Created by Jian on 2015/7/29.
 */
/**
 *
 * Abstract base class for party members.
 *
 */
abstract public class PartyMemberBase implements PartyMember{
    protected Party party;

    public PartyMemberBase(){

    }

    @Override
    public void joinedParty(Party party) {
        System.out.println(this + " joins the party");
        this.party = party;
    }

    @Override
    public void partyAction(Action action) {
        System.out.println(this + " " + action.getDescription());
    }

    @Override
    public void act(Action action) {
        if (party != null) {
            System.out.println(this + " " + action.toString());
            party.act(this, action);
        }
    }

    @Override
    abstract public String toString();
}
