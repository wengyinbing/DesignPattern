package Bridge;

/**
 * @author wengyinbing
 * @data 2021/4/15 10:53
 **/
public abstract class RemoteControl {
     Tv tv;
    public RemoteControl(Tv t){
        tv = t;
    }
    public abstract void on();

    public abstract void off();

    public abstract  void turnChannel();
}
