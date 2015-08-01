package eugene.creational.builder;

/**
 * Created by Jian on 2015/8/1.
 */
/**
 *
 * The class with many parameters.
 *
 */
public enum Armor {

    CLOTHES("clothes"), LEATHER("leather"), CHAIN_MAIL("chain mail"), PLATE_MAIL("plate mail");

    private String title;

    Armor(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
