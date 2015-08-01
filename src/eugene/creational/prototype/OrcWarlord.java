package eugene.creational.prototype;

/**
 * Created by Jian on 2015/8/1.
 */
public class OrcWarlord extends Warlord {
    public OrcWarlord() {
    }
    public OrcWarlord(OrcWarlord orcWarlord) {
    }

    @Override
    public Warlord clone() {
        return new OrcWarlord(this);
    }

    @Override
    public String toString() {
        return "Orcish warlord";
    }
}
