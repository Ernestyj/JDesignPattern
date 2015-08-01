package eugene.creational.prototype;

/**
 * Created by Jian on 2015/8/1.
 */
public class OrcMage extends Mage {
    public OrcMage() {
    }
    public OrcMage(OrcMage orcMage) {
    }

    @Override
    public Mage clone() {
        return new OrcMage(this);
    }

    @Override
    public String toString() {
        return "Orcish mage";
    }
}
