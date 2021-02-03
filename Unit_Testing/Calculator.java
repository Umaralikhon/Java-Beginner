package Platform;

/**
 * @author Umaralikhon Kayumov
 * @version 1.0
 * @dedicatedTo A.Bakhromov, D.Mamatovna,
 */

class Calculator {
    private int firstNum;
    private int secondNum;

    public Calculator(int firstNum, int secondNum){
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public int sum(){
        return firstNum + secondNum;
    }

    public int multiplication(){
        return firstNum * secondNum;
    }

    public int subtraction(){
        return firstNum - secondNum;
    }

    public double division(){
        double result = 0;
        try {
            result = firstNum / secondNum;
        } catch(ArithmeticException ex){
            System.out.println("Division to \"0\"! ");
        }

        return result;
    }
}
