package Singleton;

/**
 * @author wengyinbing
 * @data 2021/4/9 13:53
 **/
public class Singleton1 {
    /*
    饿汉模式
    优点：简单、天生线程安全、调用快、没有延迟
    缺点：有可能造成资源浪费
    启动慢
     */
    private static Singleton1 singleton1 = new Singleton1();

    private Singleton1(){
        System.out.println("构造方法！");
    }

    public static Singleton1 getInstance(){
        return singleton1;
    }

    public static void main(String[] args) {
        Singleton1 s1 = Singleton1.getInstance();
        Singleton1 s2 = Singleton1.getInstance();
        System.out.println(s1 == s2);
    }
}
