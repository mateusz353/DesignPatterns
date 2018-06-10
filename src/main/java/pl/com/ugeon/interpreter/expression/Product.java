package pl.com.ugeon.interpreter.expression;

/**
 * @author Mateusz Nowakowski, Capgemini Technology Services.
 */
public class Product implements Expression{

    private final Expression leftExpression;
    private final Expression rightExpression;

    public Product(Expression leftExpression,Expression rightExpression ){
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }
    @Override
    public int interpret() {
        return leftExpression.interpret() * rightExpression.interpret();
    }
}