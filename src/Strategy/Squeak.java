package Strategy;

/**
 * @author wengyinbing
 * @data 2021/4/14 22:18
 **/
public class Squeak implements  QuackBehavior {
    @Override
    public void quack() {
        System.out.println("squeak!");
    }
}
