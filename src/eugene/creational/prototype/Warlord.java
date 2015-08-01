package eugene.creational.prototype;

/**
 * Created by Jian on 2015/8/1.
 */
abstract public class Warlord extends Prototype{
    @Override
    abstract public Warlord clone() throws CloneNotSupportedException;
}
