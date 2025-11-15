/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2;
        char operator;
        double result = 0;

        while (true) {
            System.out.println("Enter first number: ");
            num1 = input.nextDouble();

            System.out.println("Enter operator (+, -, *, /) or x to exit: ");
            operator = input.next().charAt(0);

            if (operator == 'x' || operator == 'X') {
                System.out.println("Exiting Calculator. Goodbye!");
                break;
            }

            System.out.println("Enter second number: ");
            num2 = input.nextDouble();

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0)
                        result = num1 / num2;
                    else {
                        System.out.println("Error: Cannot divide by 0");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid operator. Try again.");
                    continue;
            }

            System.out.println("Result: " + result);
            System.out.println("--------------------------");
        }

        input.close();
    }
}