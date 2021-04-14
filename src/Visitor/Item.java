package Visitor;

/**
 * @author wengyinbing
 * @data 2021/4/14 21:32
 **/
public class Item implements Element{
    private String name;
    public Item(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
