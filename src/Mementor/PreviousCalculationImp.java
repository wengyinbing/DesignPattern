package Mementor;

/**
 * @author wengyinbing
 * @data 2021/4/14 20:33
 **/
public class PreviousCalculationImp implements PreviousCalculationToCareTaker,PreviousCalculationToOriginator{
    private int firstNumber;
    private int secondNumber;

    public PreviousCalculationImp(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public int getFirstNumber() {
        return firstNumber;
    }

    @Override
    public int getSecondNumber() {
        return secondNumber;
    }
}
