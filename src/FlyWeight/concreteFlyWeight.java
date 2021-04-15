package FlyWeight;

/**
 * @author wengyinbing
 * @data 2021/4/15 22:30
 **/
public class concreteFlyWeight implements  flyWeight{
    private String name;
    public concreteFlyWeight(String name){
        this.name = name;
    }

    @Override
    public void method(String i) {
        System.out.println(System.identityHashCode(this));
        System.out.println(name);
        System.out.println(i);
    }
}
