package ChainOfResposibility;

import static ChainOfResposibility.RequestType.Type1;

/**
 * @author wengyinbing
 * @data 2021/4/9 21:46
 **/
public class concreteHandler1 extends  Handler{

    public concreteHandler1(Handler handler){
        super(handler);
    }
    @Override
    protected void requestHandler(Request request) {
        if(request.getType() == Type1){
            System.out.println(this.getClass().getName() + "处理了" + request.getName() + "的请求");
        }
        if(this.successor != null){
            successor.requestHandler(request);
        }
    }
}
