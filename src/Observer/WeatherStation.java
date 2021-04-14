package Observer;

/**
 * @author wengyinbing
 * @data 2021/4/14 21:16
 **/
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData s = new WeatherData();
        Observer o1 = new StatisticsDisplay(s);
        Observer o2 = new CurrentConditionsDisplay(s);
        s.setStatus(1,2,3);
        s.setStatus(-1,-1,-1);
    }
}
