package calculator;

import calculator.operation.*;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter the first number: ");
            double x = in.nextDouble();
            in.nextLine();
            System.out.println("Enter arithmetic operator (‘+’, ‘-’, ‘*’ or ‘/’): ");
            String sim = in.nextLine();
            System.out.println("Enter the second number: ");
            double y = in.nextDouble();
            switch (sim) {
                case "+":
                    Operation addition = new Addition();
                    addition.showResult(x, y);
                    break;
                case "-":
                    Operation subtraction = new Subtraction();
                    subtraction.showResult(x, y);
                    break;
                case "*":
                    Operation multiplication = new Multiplication();
                    multiplication.showResult(x, y);
                    break;
                case "/":
                    Operation division = new Division();
                    division.showResult(x, y);
                    break;
                default:
                    System.out.println("ERROR");
                    return;
            }
        }catch(InputMismatchException e) {
        System.out.println("Invalid character! Exception thrown :" + e);
        }
    }
}
