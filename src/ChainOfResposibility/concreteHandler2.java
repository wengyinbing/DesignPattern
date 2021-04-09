package ChainOfResposibility;

/**
 * @author wengyinbing
 * @data 2021/4/9 21:50
 **/
public class concreteHandler2 extends Handler {
    public concreteHandler2(Handler handler){
        super(handler);
    }

    @Override
    protected void requestHandler(Request request) {
        if(request.getType() == RequestType.Type2){
            System.out.println(this.getClass().getName() + "处理了" + request.getName() + "的请求");
        }
        if(successor != null){
            successor.requestHandler(request);
        }
    }
}
