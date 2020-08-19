package chapter4;

/*
 * The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.
 * - Roll the die for the user (generate a Random number between 1 – 6) and advance the user that number of spaces on the game board.
 * - After each roll, tell the user which game space they are on and how many more spaces they have to go to win.
 * - Repeat this 4 additional times, for 5 rolls in total.
 * - However, if the user gets to 20 before 5 rolls, end the game - they’ve won.
 * - If they are greater than or less than 20 spaces exactly, they lose.
 * - Remember there are only 20 spaces on the board, so a message like “You advanced to space 22” is a bug.
 */

import java.util.Random;
import java.util.Scanner;

public class FinalExercise {

    public static void main(String args[]){

        Random random = new Random();
        int maxSpaces = 20;
        int maxDie = 5;
        int currentSpace = 0;

        System.out.println("Welcome to the game!");

        // Repeat this 4 additional times, for 5 rolls in total.
        for(int i=0; i<maxDie; i++){

            // Roll the die for the user (generate a Random number between 1 – 6) and advance the user that number of spaces on the game board.
            int die = random.nextInt(6) + 1;
            System.out.println("Roll #" + (i+1) + ": You have rolled a " + die);

            currentSpace = currentSpace + die;

            //After each roll, tell the user which game space they are on and how many more spaces they have to go to win.
            if(currentSpace == maxSpaces){
                System.out.println("You win, congratulations. You advanced to the last space: " + currentSpace + ".");
                break;
            }
            else if(currentSpace < maxSpaces && i<4){
                int toWin = maxSpaces - currentSpace;
                System.out.println("You are now on space " +  currentSpace + " and have " + toWin + " more to go.");

            }
            else if(currentSpace > maxSpaces){
                System.out.print("Unfortunately, that takes you past " + maxSpaces + " spaces. You lose!");
                break;
            }
            else{
                System.out.println("Unfortunately, you didn't make it to all " + maxSpaces + " spaces. You lose!");
                break;
            }

        }

    }
}
