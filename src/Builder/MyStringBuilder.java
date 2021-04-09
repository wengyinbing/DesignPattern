package Builder;

/**
 * @author wengyinbing
 * @data 2021/4/9 20:30
 **/
public class MyStringBuilder extends  AbstactStringBuilder {
    public MyStringBuilder(){
        super(16);
    }
    public String toString(){
        return new String(value,0,count);
    }
}
