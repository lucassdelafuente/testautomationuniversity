package chapter2;

import java.util.Scanner;

public class exercise {

    public void main(String arg[]){

        //1. Ask season of the year
        System.out.println("Enter some season of the year");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //2. Whole number
        System.out.println("Enter a whole number");
        int number = scanner.nextInt();

        //3. Adjective
        System.out.println("Enter an adjective");
        String adjective = scanner.next();
        scanner.close();

        //4. Display
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffe.");
    }
}
