package Strategy;

/**
 * @author wengyinbing
 * @data 2021/4/14 22:16
 **/
public class client {
    //动态的改变鸭子的叫声
    //通过传入的对象 分装每一个算法，使他们可以交换
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.setQuackBehavior(new Quack());
        duck.perfomance();
        duck.setQuackBehavior(new Squeak());
        duck.perfomance();
    }
}
