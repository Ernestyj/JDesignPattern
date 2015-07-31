package eugene.structural.proxy;

/**
 * Created by Jian on 2015/7/31.
 */
public class Wizard {
    private String name;

    public Wizard(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
