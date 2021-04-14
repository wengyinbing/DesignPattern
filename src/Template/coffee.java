package Template;

/**
 * @author wengyinbing
 * @data 2021/4/14 22:34
 **/
public class coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("coffee.brew()");
    }

    @Override
    void addCondiments() {
        System.out.println("coffee.addCondiments()");
    }
}
