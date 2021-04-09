package SimpleFactory;

/**
 * @author wengyinbing
 * @data 2021/4/9 15:51
 **/
public class simpleFactory {
    public static product createInstance(int type){
        product p = null;
        if(type == 1){
            p = new concreteProduct1();
        }
        else if(type == 2){
            p = new concreteProduct2();
        }
        return p;
    }
}
