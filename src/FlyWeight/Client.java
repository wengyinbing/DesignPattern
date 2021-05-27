package FlyWeight;

/**
 * @author wengyinbing
 * @data 2021/4/15 22:35
 **/
public class Client {
    public static void main(String[] args) {
        FlyWeightFactory f = new FlyWeightFactory();
        flyWeight f1 = f.add("flyweight1");
        flyWeight f2 = f.add("flyweight1");
        f1.method("aa");
        f2.method("bb");
    }
}
