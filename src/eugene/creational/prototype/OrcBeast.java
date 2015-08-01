package eugene.creational.prototype;

/**
 * Created by Jian on 2015/8/1.
 */
public class OrcBeast extends Beast {
    public OrcBeast() {
    }
    public OrcBeast(OrcBeast orcBeast) {
    }

    @Override
    public Beast clone() throws CloneNotSupportedException {
        return new OrcBeast(this);
    }

    @Override
    public String toString() {
        return "Orcish wolf";
    }
}
