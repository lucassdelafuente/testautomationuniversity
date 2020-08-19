package chapter5;

import java.util.Scanner;

/*
 * So, what you're going to do is allow the user to input the plan fee and the number of overage minutes.
 * And then you're going to charge 25 cents for every minute that they've gone over, and then a 15% tax on the subtotal.
 * I want you to create separate methods to calculate the tax, to calculate the overage fees, and to calculate and print the final total.
 * Please print this as an itemized bill. I have an example of the output expected down below.
 */
public class FinalExercise {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){

        // So, what you're going to do is allow the user to input the plan fee and the number of overage minutes.
        double planFee = getPlanFee();
        int overageMinutes = getOverageMinutes();

        scanner.close();

        // And then you're going to charge 25 cents for every minute that they've gone over, and then a 15% tax on the subtotal.
        double totalOverage = getOverage(overageMinutes);
        double tax = getTax(planFee, totalOverage);
        double total = getTotal(planFee, totalOverage, tax);

        // Please print this as an itemized bill. I have an example of the output expected down below.
        notify(planFee, totalOverage, tax, total);

    }

    public static double getPlanFee(){

        System.out.println("Enter the plan Fee: ");
        double planFee = scanner.nextDouble();
        return planFee;
    }

    public static int getOverageMinutes(){

        System.out.println("Enter the plan overage minutes: ");
        int overageMinutes = scanner.nextInt();
        return overageMinutes;
    }

    public static double getOverage(int overageMinutes){
        double charge = 0.25;
        double totalOverage = overageMinutes * charge;
        return totalOverage;
    }

    public static double getTax(double planFee, double totalOverage){
        double percent = 0.15;
        double tax = (planFee+totalOverage)*percent;
        return tax;
    }

    public static double getTotal(double planFee, double totalOverage, double tax){

        double total = planFee + totalOverage + tax;
        return total;

    }

    public static void notify(double planFee, double totalOverage, double tax, double total){
        System.out.println("Phone Bill Statement\n" +
                "Plan: $" + planFee + "\n" +
                "Overage: $" + totalOverage + "\n" +
                "Tax: $" + tax +  "\n" +
                "Total: $" + total);
    }
}
