package Singleton;

/**
 * @author wengyinbing
 * @data 2021/4/9 15:24
 **/
public class Singleton4 {
    /*
    静态内部类
    实现了懒加载
    保证了线程安全 JVM
     */

    private Singleton4(){

    }

    private static class singletonHandler{
        private static Singleton4 singleton = new Singleton4();
    }

    public static Singleton4 getInstance(){
        return singletonHandler.singleton;
    }

    public static void main(String[] args) {
        Singleton4 s1 = Singleton4.getInstance();
        Singleton4 s2 = Singleton4.getInstance();
        System.out.println(s1==s2);
    }
}
