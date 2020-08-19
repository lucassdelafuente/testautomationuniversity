package chapter7;

/*
 * Make an array that holds its actual values of the days of the week, and then have the user input a number corresponding to some day of the week.
 * And assume that the week starts on Monday.
 * Your program should output the String that represents the day of the week that corresponds to the number that the user input.
 * For example, if the user inputs the number 1, your program should print “Monday”.
 */

import java.util.Scanner;

public class FinalExercise {

    private static String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){

        System.out.println("Enter a number for the day of the week: ");
        int day = scanner.nextInt();
        scanner.close();

        String selectedDay = getDay(day);

        System.out.println("Your number corresponding to: " + selectedDay);

        //Other Solution
        //System.out.println("Corresponding day: " + daysOfWeek[day - 1]);

    }

    public static String getDay(int day){

        String daySelected = "";

        for(int i=0; i<daysOfWeek.length; i++){
            if(day == i){
                daySelected = daysOfWeek[i];
            }
        }

        return daySelected;
    }
}
