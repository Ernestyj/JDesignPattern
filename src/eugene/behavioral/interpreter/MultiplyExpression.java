package eugene.behavioral.interpreter;

/**
 * Created by Jian on 2015/8/2.
 */
public class MultiplyExpression extends Expression {
    private Expression leftExpression, rightExpression;

    public MultiplyExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    int interpret() {
        return leftExpression.interpret() * rightExpression.interpret();
    }

    @Override
    public String toString() {
        return "*";
    }
}
