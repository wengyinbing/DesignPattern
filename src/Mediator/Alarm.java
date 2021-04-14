package Mediator;

/**
 * @author wengyinbing
 * @data 2021/4/14 19:30
 **/
public class Alarm implements Colleague{
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("alarm");
    }

    public void doAlarm(){
        System.out.println("doalarm");
    }
}
