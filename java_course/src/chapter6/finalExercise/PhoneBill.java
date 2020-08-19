package chapter6.finalExercise;

/* So, a phone bill should have an ID, a base class, a number of allotted minutes and a number of minutes used.
 * And then, it should also be able to calculate the overage, calculate the tax, and calculate the total.
 * And then, it should also be able to print an itemized bill.
 * You should also include three constructors:
 *   a default one
 *   one that accepts the ID only
 *   one that accepts all fields
 * Now no matter which of these constructors you use, all fields should be set eventually.
 * Then you can also create a different class that instantiates the PhoneBill and prints out an itemized bill.
 *
 */

import java.util.Scanner;

public class PhoneBill {

    private int Id;
    private int baseClass;
    private int allottedMinutes;
    private int minutesUsed;

    //Default Constructor
    public PhoneBill(){
        Id = 0;
        baseClass = 0;
        allottedMinutes = 0;
        minutesUsed = 0;
    }

    //Constructor
    public PhoneBill(int Id){
        setId(Id);
    }

    //Constructor
    public PhoneBill(int Id, int baseClass, int allottedMinutes, int minutesUsed){
        setId(Id);
        setBaseClass(baseClass);
        setAllottedMinutes(allottedMinutes);
        setMinutesUsed(minutesUsed);
    }

    //Get and Set

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getBaseClass() {
        return baseClass;
    }

    public void setBaseClass(int baseClass) {
        this.baseClass = baseClass;
    }

    public int getAllottedMinutes() {
        return allottedMinutes;
    }

    public void setAllottedMinutes(int allottedMinutes) {
        this.allottedMinutes = allottedMinutes;
    }

    public int getMinutesUsed() {
        return minutesUsed;
    }

    public void setMinutesUsed(int minutesUsed) {
        this.minutesUsed = minutesUsed;
    }

    //Methods

    public double getOverage(){
        double charge = 0.25;
        int overageMinutes = minutesUsed - allottedMinutes;
        return (overageMinutes * charge);
    }

    public double getTax(double totalOverage){
        double percent = 0.15;
        return ((baseClass+totalOverage)*percent);
    }

    public double getTotal(double totalOverage, double tax){
        return (baseClass + totalOverage + tax);
    }

    public void printBill(double totalOverage, double tax, double total){
        System.out.println("Phone Bill Statement\n" +
                "Plan: $" + baseClass + "\n" +
                "Overage: $" + totalOverage + "\n" +
                "Tax: $" + tax +  "\n" +
                "Total: $" + total);
    }
}
