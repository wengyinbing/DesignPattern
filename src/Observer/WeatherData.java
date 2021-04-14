package Observer;

import java.util.LinkedList;
import java.util.List;

/**
 * @author wengyinbing
 * @data 2021/4/14 21:05
 **/
public class WeatherData implements subject {
    List<Observer> olist = new LinkedList<Observer>();
    private float t;
    private float h;
    private float p;

    public void setStatus(float t,float h,float p){
        this.t = t;
        this.p = p;
        this.h = h;
        notifyObserver();
    }
    @Override
    public void registerObserver(Observer o) {
        olist.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        olist.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer o:olist){
            o.update(t,h,p);
        }
    }
}
