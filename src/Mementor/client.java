package Mementor;

/**
 * @author wengyinbing
 * @data 2021/4/14 19:58
 **/
public class client {
    public static void main(String[] args) {
        Calculator cal = new CalculatorImp();
        cal.setFirstNumber(100);
        cal.setSecondNumber(200);
        System.out.println(cal.getCalculationResult());
        PreviousCalculationToCareTaker mementor = cal.backupLastCalculation();
        //cal.restorePreviousCalculation(mementor);
        cal.setFirstNumber(17);
        cal.setSecondNumber(-90);
        System.out.println(cal.getCalculationResult());
        cal.restorePreviousCalculation(mementor);
        System.out.println(cal.getCalculationResult());
    }
}
