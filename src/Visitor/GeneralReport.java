package Visitor;

/**
 * @author wengyinbing
 * @data 2021/4/14 21:52
 **/
public class GeneralReport implements Visitor{
    private int customersNo;
    private int ordersNo;
    private int itemsNo;

    public void visit(Customer customer) {
        System.out.println(customer.getClass().getName() + " " + customer.getName());
        customersNo++;
    }

    public void visit(Order order) {
        System.out.println(order.getClass().getName() + " " + order.getName());
        ordersNo++;
    }

    public void visit(Item item) {
        System.out.println(item.getClass().getName() + " " + item.getName());
        itemsNo++;
    }

    public void displayResults() {
        System.out.println("Number of customers: " + customersNo);
        System.out.println("Number of orders:    " + ordersNo);
        System.out.println("Number of items:     " + itemsNo);
    }
}
