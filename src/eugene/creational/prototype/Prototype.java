package eugene.creational.prototype;

/**
 * Created by Jian on 2015/8/1.
 */
abstract public class Prototype implements Cloneable{
    @Override
    abstract protected Object clone() throws CloneNotSupportedException;
}
