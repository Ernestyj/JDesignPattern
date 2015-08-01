package eugene.creational.prototype;

/**
 * Created by Jian on 2015/8/1.
 */
abstract public class Beast extends Prototype {
    @Override
    abstract public Beast clone() throws CloneNotSupportedException;
}
