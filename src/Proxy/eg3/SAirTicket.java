package Proxy.eg3;

import jdk.swing.interop.SwingInterOpUtils;

/**
 * @author wengyinbing
 * @data 2021/5/27 9:09
 **/
public class SAirTicket implements IAirTicket {
    @Override
    public void buy() {
        System.out.println("买了南城飞机票");
    }
}
