package eugene.creational.prototype;

/**
 * Created by Jian on 2015/8/1.
 */
public class ElfBeast extends Beast {
    public ElfBeast() {
    }
    public ElfBeast(ElfBeast elfBeast) {
    }

    @Override
    public Beast clone() throws CloneNotSupportedException {
        return new ElfBeast(this);
    }

    @Override
    public String toString() {
        return "Elven eagle";
    }
}
