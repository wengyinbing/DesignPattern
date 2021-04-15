package Bridge;

/**
 * @author wengyinbing
 * @data 2021/4/15 10:59
 **/
public class concreteControl2 extends RemoteControl {
    public concreteControl2(Tv t){
        super(t);
    }
    @Override
    public void on() {
        System.out.println(this.getClass().getName());
        tv.on();
    }

    @Override
    public void off() {
        System.out.println(this.getClass().getName());
        tv.off();
    }

    @Override
    public void turnChannel() {
        System.out.println(this.getClass().getName());
        tv.turnChannel();
    }
}
