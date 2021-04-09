package Iterator;

/**
 * @author wengyinbing
 * @data 2021/4/9 22:35
 **/
public class concreteAggregate implements Aggregate {

    private Integer[] items;

    public concreteAggregate(int n){
        items = new Integer[n];
        for(int i=0;i<n;i++){
            items[i] = i+1;
        }
    }

    @Override
    public Iterator createIterator() {
        return new concreteIterator(items);
    }
}
