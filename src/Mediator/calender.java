package Mediator;

/**
 * @author wengyinbing
 * @data 2021/4/14 19:38
 **/
public class calender implements Colleague {
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("calender");
    }
    public void doCalender(){
        System.out.println("doCalender");
    }
}
