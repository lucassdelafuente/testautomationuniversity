package chapter4;

/*
 * FOR LOOP:
 * Count-controlled-> Loops runs a specified number of items
 * Pre-test-> Condition is tested before entering the loop
 * Execution-> Best to use when the loop may or may not need to execute, based on the situation
 *
 * Exercise:
 * Write a cashier program that will can scan a given number of items and tally the cost.
 */

import java.util.Scanner;

public class Cashier {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        //Get number of items to scan
        System.out.println("Enter the number of items you would you like to scan:");
        int quantity = scanner.nextInt();

        double total = 0;

        //Create loop to iterate trough all of the items and accumulate the cost
        //The first is the Sentinel; When at end the loop ; Increment loop
       for(int i=0; i<quantity; i++){

           System.out.println("Enter the cost of the item: ");
            double price = scanner.nextDouble();

            total = total + price;
       }

       scanner.close();

        System.out.println("Your total is $" + total);

    }
}
