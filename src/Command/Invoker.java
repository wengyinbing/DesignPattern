package Command;

/**
 * @author wengyinbing
 * @data 2021/4/9 22:16
 **/
public class Invoker {
    public Command[] commandOnLight;
    public Command[] commandOffLight;
    int length = 10;

    public Invoker(){
        commandOffLight = new LightOffCommand[length];
        commandOnLight = new LightOnCommand[length];
    }

    public void setOnLight(Light light,int index){
        commandOnLight[index] = new LightOnCommand(light);
    }

    public void setOffLight(Light light,int index){
        commandOffLight[index] = new LightOffCommand(light);
    }

    public void OnButtonPush(int index){
        commandOnLight[index].execute();
    }

    public void OffButtonPush(int index){
        commandOffLight[index].execute();
    }
}
