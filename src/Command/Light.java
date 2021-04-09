package Command;

import java.util.LinkedList;

/**
 * @author wengyinbing
 * @data 2021/4/9 22:09
 **/
public class Light {
    public boolean button;

    public Light(){
        this.button = false;//刚开始是关的；
    }

    public void LightOn(){
        if(button){
            System.out.println("当前灯已经开了！");
        }
        else{
            System.out.println("成功开灯！");
            this.button = true;
        }
    }
    public void LightOff(){
        if(!button){
            System.out.println("当前灯已经关闭！");
        }
        else{
            this.button = false;
            System.out.println("成功关灯！");
        }
    }
}
