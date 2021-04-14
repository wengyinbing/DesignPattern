package Visitor;

/**
 * @author wengyinbing
 * @data 2021/4/14 21:28
 **/
public class Client {
    public static void main(String[] args) {
        Customer c1 = new Customer("customer1");
        c1.addOrder("order1","item1");
        c1.addOrder("order1","item2");
        c1.addOrder("order1","item3");

        Order o = new Order("order2","item1");
        o.addItem("item2");
        o.addItem("item3");
        Customer c2 = new Customer("customer2");
        c1.addOrder(o);

        GeneralReport gr = new GeneralReport();
        CustmerGroup cg = new CustmerGroup();
        cg.addCustomer(c1);
        cg.addCustomer(c2);
        cg.accept(gr);
        gr.displayResults();
    }
}
