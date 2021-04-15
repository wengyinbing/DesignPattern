package FlyWeight;

import java.util.HashMap;

/**
 * @author wengyinbing
 * @data 2021/4/15 22:33
 **/
public class FlyWeightFactory {
    HashMap<String,flyWeight> f = new HashMap<>();

    public flyWeight add(String name){
        if(!f.containsKey(name)){
            f.put(name,new concreteFlyWeight(name));
        }
        return f.get(name);
    }
}
