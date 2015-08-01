package eugene.behavioral.memento;

/**
 * Created by Jian on 2015/8/1.
 */
public enum StarType {

    SUN("sun"), RED_GIANT("red giant"), WHITE_DWARF("white dwarf"), SUPERNOVA("supernova"),
    DEAD("dead star"), UNDEFINED("");

    private String title;

    StarType(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
