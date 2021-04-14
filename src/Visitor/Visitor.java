package Visitor;

/**
 * @author wengyinbing
 * @data 2021/4/14 21:28
 **/
public interface Visitor {
    public void visit(Customer customer);
    public void visit(Order order);
    public void visit(Item item);
}
