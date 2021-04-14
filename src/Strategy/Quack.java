package Strategy;

/**
 * @author wengyinbing
 * @data 2021/4/14 22:17
 **/
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("quack!");
    }
}
