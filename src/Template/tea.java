package Template;

/**
 * @author wengyinbing
 * @data 2021/4/14 22:35
 **/
public class tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("tea.brew()");
    }

    @Override
    void addCondiments() {
        System.out.println("tea.addCondiments()");
    }
}
