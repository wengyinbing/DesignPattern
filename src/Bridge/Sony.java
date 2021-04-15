package Bridge;

/**
 * @author wengyinbing
 * @data 2021/4/15 10:50
 **/
public class Sony implements Tv {
    @Override
    public void on() {
        System.out.println(this.getClass().getName() + " on");
    }

    @Override
    public void off() {
        System.out.println(this.getClass().getName() + " off");
    }

    @Override
    public void turnChannel() {
        System.out.println(this.getClass().getName() + " turnChannel");
    }
}
