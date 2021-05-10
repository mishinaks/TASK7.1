package calculator.operation;

public class Multiplication implements Operation{
    @Override
    public void showResult(double x, double y) {
        double result = x * y;
        if(result - Math.floor(result) > 0) {
            System.out.println("Result: " + result);
        }
        else{
            int resultInt = (int) result;
            System.out.println("Result: " + resultInt);
        }
    }
}
