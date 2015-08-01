package eugene.creational.builder;

/**
 * Created by Jian on 2015/8/1.
 */
public enum HairColor {

    WHITE, BLOND, RED, BROWN, BLACK;

    @Override
    public String toString() {
        return name().toLowerCase();
    }

}