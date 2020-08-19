package chapter4;

/*
 * WHILE LOOP:
 * Condition-Controlled-> Loop continues running while the specified condition remains true.
 * Pre-test-> Condition is tested before entering the loop.
 * Execution-> Best to use when the loop may or may not need to execute, based on the situation.
 *
 * Exercise:
 * Each store employee makes $15 an hour. Write a program that allows the employee
 * to enter the number of hours worked for the week. Do not allow overtime.
 */

import java.util.Scanner;

public class GrossPayInputValidation {

    public static void main(String args[]){

        int rate = 15;
        int maxHours = 40;
        int minHours = 1;


        System.out.println("Hello, enter the number of hours worked for the week please");
        Scanner scanner = new Scanner(System.in);
        double hoursWroked = scanner.nextDouble();

        //Validate input
        while(hoursWroked > maxHours || hoursWroked < minHours){
            System.out.println("Invalid entry. Yours hours must be between 1 and 40. Try again.");
            //Sentinel, controlled the loop
            hoursWroked = scanner.nextDouble();
        }

        scanner.close();

        //Calculate gross
        double gross = rate * hoursWroked;
        System.out.println("Gross pay: $" + gross);

    }
}
