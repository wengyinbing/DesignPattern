package AbstrctFactory;

/**
 * @author wengyinbing
 * @data 2021/4/9 19:25
 **/
public class concreteFactory1 implements AbstractFactory {
    @Override
    public abstractProductA createProductA() {
        return new productA1();
    }

    @Override
    public abstractProductB createProductB() {
        return new productB1();
    }
}
