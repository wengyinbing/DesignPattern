package Facade;

/**
 * @author wengyinbing
 * @data 2021/4/15 11:08
 **/
public class Facade {
    private SubSystem subSystem = new SubSystem();

    public void watchMovie() {
        subSystem.turnOnTV();
        subSystem.setCD("a movie");
        subSystem.startWatching();
    }
}
