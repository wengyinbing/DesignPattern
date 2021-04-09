package Command;

/**
 * @author wengyinbing
 * @data 2021/4/9 22:01
 **/
public class client {

    public static void main(String[] args) {
        Light light = new Light();
        Invoker invoker = new Invoker();

        invoker.setOnLight(light,0);
        invoker.setOffLight(light,0);

        invoker.OffButtonPush(0);
        invoker.OnButtonPush(0);
        invoker.OffButtonPush(0);
    }
}
