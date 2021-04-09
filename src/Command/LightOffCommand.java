package Command;

/**
 * @author wengyinbing
 * @data 2021/4/9 22:09
 **/
public class LightOffCommand implements  Command {

    private Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.LightOff();
    }
}
