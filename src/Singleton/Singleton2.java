package Singleton;

/**
 * @author wengyinbing
 * @data 2021/4/9 14:15
 **/
public class Singleton2 {
    /*
    懒汉模式
    用到才加载
    非线程安全模式
     */
    private static Singleton2 singleton=null;

    private Singleton2(){

    }

    public static Singleton2 getInstance(){
        if(singleton == null){
            singleton = new Singleton2();
        }
        return singleton;
    }

    public static void main(String[] args) {
        Singleton2 s1 = Singleton2.getInstance();
        Singleton2 s2 = Singleton2.getInstance();
        System.out.println(s1==s2);
    }
}
