package Proxy.eg1;

/**
 * @author wengyinbing
 * @data 2021/5/26 22:23
 **/
public class client {
    public static void main(String[] args) {
        IAirTicket ia = new ProxyAirTicket();
        ia.buy();
    }
}
