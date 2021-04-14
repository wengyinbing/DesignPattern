package Observer;

/**
 * @author wengyinbing
 * @data 2021/4/14 21:11
 **/
public class CurrentConditionsDisplay implements Observer {
    public CurrentConditionsDisplay(subject s) {
        s.registerObserver(this);
    }

    @Override
    public void update(float t, float h, float p) {
        System.out.println(this.getClass().getName() + " update: "+ t +" "+ h +" " + p);
    }
}
