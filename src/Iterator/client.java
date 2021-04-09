package Iterator;

/**
 * @author wengyinbing
 * @data 2021/4/9 22:38
 **/
public class client {
    public static void main(String[] args) {
        Aggregate a = new concreteAggregate(10);
        Iterator iterator = a.createIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
