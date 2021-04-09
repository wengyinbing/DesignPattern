package ChainOfResposibility;

/**
 * @author wengyinbing
 * @data 2021/4/9 21:43
 **/
public abstract class Handler {
    public Handler successor;//为了构建链的结构

    public Handler(Handler successor){
        this.successor = successor;
    }

    protected abstract void requestHandler(Request request);
}
