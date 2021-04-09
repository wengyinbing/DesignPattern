package Prototype;

/**
 * @author wengyinbing
 * @data 2021/4/9 21:18
 **/
public class client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype p1 = new concretePrototype("pppp");
        Prototype p2 = p1.myClone();
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1 == p2);
    }
}
