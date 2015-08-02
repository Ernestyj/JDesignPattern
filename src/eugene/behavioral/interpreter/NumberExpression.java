package eugene.behavioral.interpreter;

/**
 * Created by Jian on 2015/8/2.
 */
public class NumberExpression extends Expression {
    private int number;

    public NumberExpression(String s) {
        this.number = Integer.parseInt(s);
    }

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    int interpret() {
        return number;
    }

    @Override
    public String toString() {
        return "number";
    }
}
