package AbstrctFactory;

/**
 * @author wengyinbing
 * @data 2021/4/9 19:27
 **/
public class client {
    public static void main(String[] args) {
        AbstractFactory factory = new concreteFactory1();
        abstractProductA productA = factory.createProductA();
        System.out.println(productA.getClass().getName());
    }
}
