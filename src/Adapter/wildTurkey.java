package Adapter;

/**
 * @author wengyinbing
 * @data 2021/4/14 22:25
 **/
public class wildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println(this.getClass().getName() + " gobble!" );
    }
}
