package Iterator;

/**
 * @author wengyinbing
 * @data 2021/4/9 22:30
 **/
public interface Iterator<Item> {
    boolean hasNext();
    Item next();
}
