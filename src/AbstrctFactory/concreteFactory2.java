package AbstrctFactory;

/**
 * @author wengyinbing
 * @data 2021/4/9 19:26
 **/
public class concreteFactory2 implements AbstractFactory {
    @Override
    public abstractProductA createProductA() {
        return new productA2();
    }

    @Override
    public abstractProductB createProductB() {
        return new productB2();
    }
}
