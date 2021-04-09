package FactoryMethod;

import SimpleFactory.simpleFactory;

/**
 * @author wengyinbing
 * @data 2021/4/9 15:46
 **/
public class client {
    public static void main(String[] args) {
        Factory f = new concreteFactory();
        product p = f.getInstance();
        System.out.println(p.getClass().getName());
    }
}
