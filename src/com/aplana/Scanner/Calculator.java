package com.aplana.Scanner;
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {

        String operation;

        System.out.println(" Welcome to Java Calculator v0.1 \n");
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Please enter two numbers");
        System.out.print("\n First number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("\n Second number: ");
        double secondNumber = scanner.nextDouble();
        System.out.println("\n Select between (*,/,+,-)\n Type out the character in a single letter: ");
        operation = scanner.next();

        String eo = "You have selected ";

        switch (operation) {
            case "*":
                System.out.println(eo + "* \n Your Result: "+ ( firstNumber * secondNumber ));
                break;
            case "/":
                System.out.println(eo + "/ \n Your Result: "+ ( firstNumber / secondNumber ));
                break;
            case "+":
                System.out.println(eo + "+ \n Your Result: "+ ( firstNumber + secondNumber ));
                break;
            case "-":
                System.out.println(eo + "- \n Your Result: "+ ( firstNumber - secondNumber ));
                break;
            default: System.out.println("\n Please select a valid character");
        }

        scanner.close();
        System.out.println(" Closing Application ");
    }
}