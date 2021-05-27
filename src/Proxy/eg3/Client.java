package Proxy.eg3;

import java.lang.reflect.Proxy;

/**
 * @author wengyinbing
 * @data 2021/5/27 9:29
 **/
public class Client {
    public static void main(String[] args) {
        IAirTicket nat = new NAirTicket();
        IAirTicket sat = new SAirTicket();

        AirInvocation a1 = new AirInvocation(nat);
        AirInvocation a2 = new AirInvocation(sat);

        IAirTicket proxy1 = (IAirTicket) Proxy.newProxyInstance(nat.getClass().getClassLoader(),nat.getClass().getInterfaces(),a1);
        IAirTicket proxy2 = (IAirTicket) Proxy.newProxyInstance(nat.getClass().getClassLoader(),nat.getClass().getInterfaces(),a2);

        proxy1.buy();
        System.out.println(nat.getClass());
        System.out.println(nat.getClass().getClassLoader());
        System.out.println(nat.getClass().getInterfaces());
        proxy2.buy();
    }
}
/*
下面讲解它的 3 个参数意义。

loader 自然是类加载器
interfaces 代码要用来代理的接口
h 一个 InvocationHandler 对象
 */