package Mediator;

/**
 * @author wengyinbing
 * @data 2021/4/14 19:29
 **/
public class ConcreteMediator implements Mediator{
    private Alarm alarm;
    private calender cal;
    private coffeePot coffee;

    public ConcreteMediator(Alarm alarm, calender cal, coffeePot coffee) {
        this.alarm = alarm;
        this.cal = cal;
        this.coffee = coffee;
    }

    @Override
    public void doEvent(String Type) {
        switch (Type){
            case "alarm":
                doAlarmEvent();
                break;
            case "calender":
                doCalenderEvent();
                break;
            case "coffeePot":
                doCoffeePotEvent();
                break;
            default:
                    System.out.println("输入错误！");
        }
    }

    public void doAlarmEvent(){
        cal.doCalender();
        coffee.doCoffeePot();
    }

    public void doCalenderEvent(){
        alarm.doAlarm();
        coffee.doCoffeePot();
    }
    public void doCoffeePotEvent(){
        alarm.doAlarm();
        cal.doCalender();
    }
}
