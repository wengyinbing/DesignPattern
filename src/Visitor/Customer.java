package Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wengyinbing
 * @data 2021/4/14 21:34
 **/
public class Customer implements Element {
    private String name;
    private List<Order> orderList = new ArrayList<Order>();

    public String getName() {
        return name;
    }

    public Customer(String name) {
        this.name = name;
        //this.addOrder(OrderName,ItemName);
    }
    public void addOrder(String orderName,String ItemName){
        this.orderList.add(new Order(orderName,ItemName));
    }

    public  void addOrder(Order o){
        this.orderList.add(o);
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for(Order o : orderList){
            o.accept(visitor);
        }
    }
}
