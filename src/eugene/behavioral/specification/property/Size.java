package eugene.behavioral.specification.property;

/**
 * Created by Jian on 2015/8/12.
 */
/**
 *
 * Size property.
 *
 */
public enum Size {

    SMALL("small"), NORMAL("normal"), LARGE("large");

    private String title;

    Size(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
