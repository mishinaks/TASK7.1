package calculator.operation;

import java.util.InputMismatchException;

public class Division implements Operation {
    @Override
    public void showResult(double x, double y) {
        try {
            if (y == 0){
                int zero = (int) y;
                int res = 1 / zero;
            }
            double result = x / y;
            if(result - Math.floor(result) > 0) {
                System.out.println("Result: " + result);
            }
            else{
                int resultInt = (int) result;
                System.out.println("Result: " + resultInt);
            }
        }catch(ArithmeticException e) {
        System.out.println("Divide by zero! Exception thrown :" + e);
        }
    }
}
