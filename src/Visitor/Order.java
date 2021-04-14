package Visitor;

import Command.Light;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wengyinbing
 * @data 2021/4/14 21:34
 **/
public class Order  implements Element {
    private String name;
    private List<Item> itemList = new ArrayList<Item>();
    private String ItemName;

    public String getName() {
        return name;
    }

    public Order(String name) {
        this.name = name;
    }

    public Order(String name, String itemName) {
        this.name = name;
        this.addItem(itemName);
    }

    public void addItem(String itemName){
        itemList.add(new Item(itemName));
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for(Item item:itemList){
            item.accept(visitor);
        }
    }
}
