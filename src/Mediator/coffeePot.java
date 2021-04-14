package Mediator;

/**
 * @author wengyinbing
 * @data 2021/4/14 19:36
 **/
public class coffeePot implements Colleague {
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("coffeePot");
    }
    public void doCoffeePot(){
        System.out.println("doCoffeePot");
    }
}
