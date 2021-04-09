package FactoryMethod;

/**
 * @author wengyinbing
 * @data 2021/4/9 16:06
 **/
public class concreteFactory2 extends Factory {
    @Override
    product getInstance() {
        return new concreteProduct2();
    }
}
