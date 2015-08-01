package eugene.creational.prototype;

/**
 * Created by Jian on 2015/8/1.
 */
abstract public class Mage extends Prototype {
    @Override
    abstract public Mage clone() throws CloneNotSupportedException;
}
