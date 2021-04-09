package SimpleFactory;

/**
 * @author wengyinbing
 * @data 2021/4/9 15:46
 **/
public class client {
    public static void main(String[] args) {
        product p = simpleFactory.createInstance(1);
        System.out.println(p.getClass().getName());
    }
}
