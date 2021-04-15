package Bridge;

/**
 * @author wengyinbing
 * @data 2021/4/15 10:55
 **/
public class concreteControl extends RemoteControl {
    public concreteControl(Tv tv){
        super(tv);
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
