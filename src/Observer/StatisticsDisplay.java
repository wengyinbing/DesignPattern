package Observer;

/**
 * @author wengyinbing
 * @data 2021/4/14 21:10
 **/
public class StatisticsDisplay implements Observer{
    public StatisticsDisplay(subject w) {
        w.registerObserver(this);
    }

    @Override
    public void update(float t, float h, float p) {
        System.out.println(this.getClass().getName() + " update: "+ t +" "+ h +" " + p);
    }
}
