package Observer;

/**
 * @author wengyinbing
 * @data 2021/4/14 20:55
 **/
public interface subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();
}
