package FactoryMethod;

/**
 * @author wengyinbing
 * @data 2021/4/9 16:01
 **/
public abstract class Factory {
    abstract product getInstance();

    public void doSomething(){
        product p = getInstance();
        //
    }
}
