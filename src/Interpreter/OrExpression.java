package Interpreter;

/**
 * @author wengyinbing
 * @data 2021/4/13 9:58
 **/
public class OrExpression implements Expression{
    public Expression expression1 = null;
    public Expression expression2 = null;

    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String str) {
        System.out.println("or " + str);
        return expression1.interpret(str) || expression2.interpret(str);
    }

    @Override
    public String toString() {
        return "OrExpression{" +
                "expression1=" + expression1 +
                ", expression2=" + expression2 +
                '}';
    }
}
