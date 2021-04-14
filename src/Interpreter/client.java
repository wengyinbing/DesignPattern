package Interpreter;

/**
 * @author wengyinbing
 * @data 2021/4/13 9:57
 **/
public class client {
    /**
     * 构建解析树
     */
    public static Expression buildInterpreterTree() {
        // Literal
        Expression terminal1 = new TerminalExpression("A");
        Expression terminal2 = new TerminalExpression("B");
        Expression terminal3 = new TerminalExpression("C");
        Expression terminal4 = new TerminalExpression("D");
        // B C
        Expression alternation1 = new OrExpression(terminal2, terminal3);
        // A Or (B C)
        Expression alternation2 = new OrExpression(terminal1, alternation1);
        // D And (A Or (B C))
        return new AndExpression(terminal4, alternation2);
    }

    public static void main(String[] args) {
        Expression define = buildInterpreterTree();
        System.out.println(define.toString());
        String context1 = "D A";
        String context2 = "A";
        System.out.println(define.interpret(context1));
        System.out.println(define.interpret(context2));
    }
}
