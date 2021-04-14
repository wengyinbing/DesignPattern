package Interpreter;

import java.util.StringTokenizer;

/**
 * @author wengyinbing
 * @data 2021/4/13 9:57
 **/
public class TerminalExpression implements Expression {
    private String literal = null;

    public TerminalExpression(String literal) {
        this.literal = literal;
    }

    @Override
    public boolean interpret(String str) {
        StringTokenizer st = new StringTokenizer(str);
        while(st.hasMoreTokens()){//返回是否有分割符
            String test = st.nextToken();
            System.out.println(test);
            if(test.equals(literal)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "TerminalExpression{" +
                "literal='" + literal + '\'' +
                '}';
    }
}
