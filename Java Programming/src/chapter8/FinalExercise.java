package chapter8;

/*
 * Validate the complexity of a proposed password by assuring it meets these rules:
 * The password must be at least eight characters long.
 * Contain an uppercase letter.
 * Contain a special character.
 * Not contain the username.
 * Not be the same as the old password.
 */

import java.util.Scanner;

public class FinalExercise {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        printPasswordRules();

        System.out.print("Enter the old password: ");
        String oldPassword = scanner.next();

        System.out.print("Enter the new password: ");
        String newPassword = scanner.next();

        scanner.close();

        String validate = getValidation(oldPassword, newPassword);

        System.out.print(validate);

    }

    public static void printPasswordRules(){
        System.out.println("Your new password must meet the following requirements:");
        System.out.println("* at least 8 characters long");
        System.out.println("* contain an uppercase letter");
        System.out.println("* contain a special character");
        System.out.println("* not contain the username");
        System.out.println("* not the same as the old password");
        System.out.println();
    }

    public static String getValidation(String oldPassword, String newPassword){

        int minLong = 8;
        String message = "Your password was change successfuly.";;

        if (newPassword.equals(oldPassword)) {
            message = "Sorry, your new password is equal to the old password, try again.";
            return message;
        }
        else if (newPassword.length() < minLong){
            message = "Sorry, your new password should have more than 7 characters.";
            return message;
        }
        if(newPassword.equals(newPassword.toLowerCase())){
            message = "Sorry, your new password should have contain at least one upper case.";
            return message;
        }
        if(newPassword.matches("[a-zA-Z0-9 ]*")){
            message = "Sorry, your new password should have contain at least one special character.";
            return message;
        }

        return message;

    }
}
