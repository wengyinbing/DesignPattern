package Decorator;

/**
 * @author wengyinbing
 * @data 2021/5/26 21:40
 **/
public class Mocha extends CondimentDecorator{
    public Mocha(Beverage b){
        beverage = b;
    }
    @Override
    public double cost() {
        return 1 + beverage.cost();
    }
}
