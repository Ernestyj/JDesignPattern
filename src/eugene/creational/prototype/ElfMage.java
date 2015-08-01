package eugene.creational.prototype;

/**
 * Created by Jian on 2015/8/1.
 */
public class ElfMage extends Mage {
    public ElfMage() {
    }
    public ElfMage(ElfMage elfMage) {
    }

    @Override
    public Mage clone() {
        return new ElfMage(this);
    }

    @Override
    public String toString() {
        return "Elven mage";
    }
}
