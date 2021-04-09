package ChainOfResposibility;

/**
 * @author wengyinbing
 * @data 2021/4/9 21:41
 **/
public class client {
    public static void main(String[] args) {
        /*
        构建责任链
         */
        Handler h1 = new concreteHandler1(null);
        Handler h2 = new concreteHandler2(h1);

        //处理请求
        h2.requestHandler(new Request(RequestType.Type1,"Type1"));
        h2.requestHandler(new Request(RequestType.Type2,"Type2"));
    }
}
