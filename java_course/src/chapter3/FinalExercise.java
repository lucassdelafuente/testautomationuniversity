package chapter3;

/*
You're going to create a program that asks the user to enter the quantities for the following coins.

You'll ask them how many pennies would you like?
How many nickels would you like?
How many dimes?
And then, how many quarters?
What your program is going to do is count up the value of all of the change that they answered.

If it's exactly one dollar then they win the game.
If it's more than one dollar, then you need to tell them that it's more than one dollar and how much they went over.
If it's less than one dollar, tell them how much they went under.
 */

import java.util.Scanner;

public class FinalExercise {

    public static void main(String args[]){

        double penny = .01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;
        int dollar = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number of pennies:");
        int pennies = scanner.nextInt();

        System.out.println("How many nickels would you like?");
        int nickels = scanner.nextInt();

        System.out.println("How many dimes?");
        int dimes = scanner.nextInt();

        System.out.println("How many quarters?");
        int quarters = scanner.nextInt();

        scanner.close();

        double sum = (pennies*penny) + (nickels*nickel) + (dimes*dime) + (quarters*quarter);

        if(sum == dollar){
            System.out.println("You win the game!");
        }
        else if(sum > dollar){
            System.out.println("Sorry, you lose! You were over " + (sum-dollar));
        }
        else{
            System.out.println("Sorry, you lose! You were short " + (dollar-sum));
        }


    }
}
