package Interpreter;

/**
 * @author wengyinbing
 * @data 2021/4/13 9:57
 **/
public class AndExpression implements Expression{
    public Expression expression1 = null;
    public Expression expression2 = null;

    public AndExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String str) {
        System.out.println("and " + str);
        return expression1.interpret(str) && expression2.interpret(str);
    }

    @Override
    public String toString() {
        return "AndExpression{" +
                "expression1=" + expression1 +
                ", expression2=" + expression2 +
                '}';
    }
}
