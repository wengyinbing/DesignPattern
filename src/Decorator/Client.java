package Decorator;

/**
 * @author wengyinbing
 * @data 2021/5/26 21:40
 **/
public class Client {
    public static void main(String[] args) {
        Beverage hb = new HouseBlend();
        hb = new Milk(hb);
        hb = new Mocha(hb);
        System.out.println(hb.cost());
    }
}
