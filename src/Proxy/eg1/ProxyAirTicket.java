package Proxy.eg1;

/**
 * @author wengyinbing
 * @data 2021/5/26 22:21
 **/
public class ProxyAirTicket implements IAirTicket {
    private AirTicket airTicket;
    public ProxyAirTicket(){
        airTicket = new AirTicket();
    }
    @Override
    public void buy() {
        System.out.println("登录买票软件");
        airTicket.buy();
        System.out.println("提醒买票成功！");
    }
}
