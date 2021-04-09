package Prototype;

import java.security.PublicKey;

/**
 * @author wengyinbing
 * @data 2021/4/9 21:14
 **/
public class concretePrototype implements Prototype, Cloneable {
    public String f;

    public concretePrototype(String f){
        this.f = f;
    }

    @Override
    public String toString() {
        return "concretePrototype{" +
                "f='" + f + '\'' +
                '}';
    }

    @Override
    public Prototype myClone() throws CloneNotSupportedException {
        return (Prototype) this.clone();
    }
}
