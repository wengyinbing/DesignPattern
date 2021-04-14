package Adapter;

/**
 * @author wengyinbing
 * @data 2021/4/14 22:26
 **/
public class TurkeyAdapter implements Duck {
    private Turkey turkey;
    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }
    @Override
    public void quack() {
        turkey.gobble();
    }
}
