package Mementor;

/**
 * @author wengyinbing
 * @data 2021/4/14 20:40
 **/
public class CalculatorImp implements  Calculator{
    private int firstNumber;
    private int secondNumber;
    @Override
    public PreviousCalculationToCareTaker backupLastCalculation() {
        return new PreviousCalculationImp(firstNumber,secondNumber);
    }

    @Override
    public void restorePreviousCalculation(PreviousCalculationToCareTaker memento) {
        this.firstNumber = ((PreviousCalculationToOriginator)memento).getFirstNumber();
        this.secondNumber =((PreviousCalculationToOriginator)memento).getSecondNumber();
    }

    @Override
    public int getCalculationResult() {
        return this.firstNumber + this.secondNumber;
    }

    @Override
    public void setFirstNumber(int firstNumber) {
            this.firstNumber = firstNumber;
    }

    @Override
    public void setSecondNumber(int secondNumber) {
            this.secondNumber = secondNumber;
    }
}
