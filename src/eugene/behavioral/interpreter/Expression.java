package eugene.behavioral.interpreter;

/**
 * Created by Jian on 2015/8/2.
 */
abstract public class Expression {
    abstract int interpret();

    @Override
    abstract public String toString();
}
