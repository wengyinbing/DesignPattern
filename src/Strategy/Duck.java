package Strategy;

/**
 * @author wengyinbing
 * @data 2021/4/14 22:18
 **/
public class Duck {
    private QuackBehavior quackBehavior;

    public void setQuackBehavior(QuackBehavior qb){
        this.quackBehavior = qb;
    }

    public void perfomance(){
        if(quackBehavior != null){
            quackBehavior.quack();
        }

    }
}
