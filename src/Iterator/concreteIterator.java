package Iterator;

/**
 * @author wengyinbing
 * @data 2021/4/9 22:32
 **/
public class concreteIterator<Item> implements Iterator {
    private Item[] items;
    private int index;

    public concreteIterator(Item[] items){
        this.items = items;
        index = 0;
    }


    @Override
    public boolean hasNext() {
        return index < items.length;
    }

    @Override
    public Object next() {

        return items[index++];
    }
}
