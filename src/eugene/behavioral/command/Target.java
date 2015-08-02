package eugene.behavioral.command;

/**
 * Created by Jian on 2015/8/2.
 */
/**
 *
 * Base class for spell targets.
 *
 */
abstract public class Target {
    private Size size;
    private Visibility visibility;

    @Override
    abstract public String toString();

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    protected Target() {

    }

    public void printStatus(){
        System.out.println(String.format("%s, [size=%s] [visibility=%s]", this,
                getSize(), getVisibility()));
        System.out.println();
    }
}
