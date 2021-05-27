package Decorator;

/**
 * @author wengyinbing
 * @data 2021/5/26 21:39
 **/
public class DarkRoast implements Beverage{
    //焦糖咖啡
    @Override
    public double cost() {
        return 1;
    }
}
