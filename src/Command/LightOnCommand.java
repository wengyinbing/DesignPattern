package Command;

import java.util.Locale;

/**
 * @author wengyinbing
 * @data 2021/4/9 22:08
 **/
public class LightOnCommand implements  Command {

    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.LightOn();
    }
}
