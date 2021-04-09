package FactoryMethod;

/**
 * @author wengyinbing
 * @data 2021/4/9 16:05
 **/
public class concreteFactory extends Factory {
    @Override
    product getInstance() {
        return new concreteProduct1();
    }
}
