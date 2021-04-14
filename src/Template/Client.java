package Template;

/**
 * @author wengyinbing
 * @data 2021/4/14 22:33
 **/
public class Client {
    public static void main(String[] args) {
        CaffeineBeverage c = new coffee();
        c.prepareRecipe();

        System.out.println();
        CaffeineBeverage t = new tea();
        t.prepareRecipe();
    }
}
