package Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wengyinbing
 * @data 2021/4/14 21:49
 **/
public class CustmerGroup {
    public List<Customer> customerList = new ArrayList<Customer>();

    void accept(Visitor visitor){
        for(Customer c: customerList){
            c.accept(visitor);
        }
    }
    void addCustomer(Customer c){
        customerList.add(c);
    }
}
