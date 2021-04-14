package Visitor;

/**
 * @author wengyinbing
 * @data 2021/4/14 21:28
 **/
public interface Element {
    public void accept(Visitor visitor);
}
