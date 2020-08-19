package chapter6.finalExercise;

import java.util.Scanner;

public class PrintBill {

    Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){

        PrintBill printBill = new PrintBill();

        //Get all information about the Bill that need to the Class PhoneBill
        PhoneBill infoUser = printBill.getInfo();

        double overage = printBill.getOverage(infoUser);
        double tax = printBill.getTax(infoUser, overage);
        double total = printBill.getTotal(infoUser, overage, tax);

        infoUser.printBill(overage, tax, total);

    }

    public PhoneBill getInfo(){

        System.out.println("Enter the ID PhoneBill: ");
        int Id = scanner.nextInt();

        System.out.println("Enter a base class: $");
        int baseClass = scanner.nextInt();

        System.out.println("Enter the number of allotted minutes: ");
        int allottedMinutes = scanner.nextInt();

        System.out.println("Enter the number of minutes used: ");
        int minutesUsed = scanner.nextInt();

        scanner.close();

        return new PhoneBill(Id, baseClass, allottedMinutes, minutesUsed);

    }

    public double getOverage(PhoneBill infoUser){
        return infoUser.getOverage();
    }

    public double getTax(PhoneBill infoUser, double overage){
        return infoUser.getTax(overage);
    }

    public double getTotal(PhoneBill infoUser, double overage, double tax){
        return  infoUser.getTotal(overage, tax);
    }
}
