package chapter4;

/*
 * DO WHILE LOOP:
 * Condition-controlled-> Loop continues running while the specified condition remains true.
 * Post-test-> Condition is tested after de completing the loop.
 * Execution-> Best to use when the loop may or may not need to execute, based on the situation.
 *
 * Exercise:
 * Write a program that allows a user to enter two numbers,
 * and then sums up the two numbers. The user should be able to
 * repeat this action until they indicate they are done.

 */

import java.util.Scanner;

public class AddNumbers {

    public static void main(String args[]){

        boolean again;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Enter the first number");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second number");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;

            System.out.println("The sum is " + sum);

            System.out.println("Would you like to start over?");
            //Sentinel
            again = scanner.nextBoolean();

        } while(again);

        scanner.close();

    }
}
