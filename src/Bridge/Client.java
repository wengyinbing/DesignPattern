package Bridge;

/**
 * @author wengyinbing
 * @data 2021/4/15 11:00
 **/
public class Client {
    public static void main(String[] args) {
        RemoteControl c1 = new concreteControl(new Sony());
        c1.on();
        c1.off();
        c1.turnChannel();
        RemoteControl c2 = new concreteControl2((new RCA()));
        c2.turnChannel();
        c2.off();
        c2.on();
    }
}
