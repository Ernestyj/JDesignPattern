package eugene.creational.builder;

/**
 * Created by Jian on 2015/8/1.
 */
public enum Profession {

    WARRIOR, THIEF, MAGE, PRIEST;

    @Override
    public String toString() {
        return name().toLowerCase();
    }

}
