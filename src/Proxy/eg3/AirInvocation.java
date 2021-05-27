package Proxy.eg3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author wengyinbing
 * @data 2021/5/27 9:11
 **/
public class AirInvocation implements InvocationHandler {
    private Object target;
    public AirInvocation(Object target){
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("登录账号");
        method.invoke(target);
        System.out.println("提醒登机时间！");
        return null;
    }
}
/*
InvocationHandler 内部只是一个 invoke() 方法，正是这个方法决定了怎么样处理代理传递过来的方法调用。
proxy 代理对象
method 代理对象调用的方法
args 调用的方法中的参数
因为，Proxy 动态产生的代理会调用 InvocationHandler 实现类，所以 InvocationHandler 是实际执行者。
 */