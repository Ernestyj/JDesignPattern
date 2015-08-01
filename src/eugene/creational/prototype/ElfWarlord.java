package eugene.creational.prototype;

/**
 * Created by Jian on 2015/8/1.
 */
public class ElfWarlord extends Warlord {
    public ElfWarlord() {
    }
    public ElfWarlord(ElfWarlord elfWarlord) {
    }

    @Override
    public Warlord clone() {
        return new ElfWarlord(this);
    }

    @Override
    public String toString() {
        return "Elven warlord";
    }
}
