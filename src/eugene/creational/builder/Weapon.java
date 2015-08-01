package eugene.creational.builder;

/**
 * Created by Jian on 2015/8/1.
 */
public enum Weapon {

    DAGGER, SWORD, AXE, WARHAMMER, BOW;

    @Override
    public String toString() {
        return name().toLowerCase();
    }

}
