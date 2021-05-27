package Decorator;

/**
 * @author wengyinbing
 * @data 2021/5/26 21:40
 **/
public class Milk  extends CondimentDecorator{

    public  Milk(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return  1 + beverage.cost();
    }
}
