package Mediator;

/**
 * @author wengyinbing
 * @data 2021/4/14 19:24
 **/
public class client {
    public static void main(String[] args) {
        Alarm alarm = new Alarm();
        calender cal = new calender();
        coffeePot cof = new coffeePot();
        Mediator m = new ConcreteMediator(alarm,cal,cof);
        alarm.onEvent(m);
        System.out.println();
        cal.onEvent(m);
        System.out.println();
        cof.onEvent(m);
    }
}
