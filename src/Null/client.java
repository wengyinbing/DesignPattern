package Null;

import com.sun.source.tree.NewArrayTree;

/**
 * @author wengyinbing
 * @data 2021/4/10 9:36
 **/
public class client {
    public static void main(String[] args) {
        client c = new client();
        AbstractOperation abo = c.set(-1);

        abo.request();

        abo = c.set(10);

        abo.request();

    }

    public AbstractOperation set(int number){
        if(number < 0){
            return new NullOperation();
        }
        return new RealOperation();
    }
}
