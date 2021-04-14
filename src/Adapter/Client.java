package Adapter;

/**
 * @author wengyinbing
 * @data 2021/4/14 22:28
 **/
public class Client {
    public static void main(String[] args) {
        Turkey turkey = new wildTurkey();
        Duck ta = new TurkeyAdapter(turkey);
        ta.quack();
    }
}
