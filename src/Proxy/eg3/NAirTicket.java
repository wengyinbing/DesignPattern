package Proxy.eg3;


import Proxy.eg1.AirTicket;

/**
 * @author wengyinbing
 * @data 2021/5/27 9:07
 **/
public class NAirTicket implements IAirTicket {
    @Override
    public void buy() {
        System.out.println("买北飞机场的票");
    }
}
