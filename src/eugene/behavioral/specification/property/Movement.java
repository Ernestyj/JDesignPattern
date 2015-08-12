package eugene.behavioral.specification.property;

/**
 * Created by Jian on 2015/8/12.
 */
/**
 *
 * Movement property.
 *
 */
public enum Movement {

    WALKING("walking"), SWIMMING("swimming"), FLYING("flying");

    private String title;

    Movement(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
