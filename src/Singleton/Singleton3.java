package Singleton;

/**
 * @author wengyinbing
 * @data 2021/4/9 14:25
 **/
public class Singleton3 {
    /*
    双重锁机制
     */
    private static volatile Singleton3 singleton = null;

    private Singleton3(){

    }

    public  static Singleton3 getInstance(){
        if(singleton == null){
            synchronized (Singleton3.class){
                if(singleton == null){
                    singleton = new Singleton3();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) {
        Singleton3 s1 = Singleton3.getInstance();
        Singleton3 s2 = Singleton3.getInstance();
        System.out.println(s1==s2);
    }
}
