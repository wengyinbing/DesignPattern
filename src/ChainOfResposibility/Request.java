package ChainOfResposibility;

/**
 * @author wengyinbing
 * @data 2021/4/9 21:41
 **/
public class Request {
    private String name;
    private RequestType type;

    public Request(RequestType type,String name){
        this.type = type;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RequestType getType() {
        return type;
    }

    public void setType(RequestType type) {
        this.type = type;
    }
}
