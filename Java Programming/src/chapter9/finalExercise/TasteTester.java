package chapter9.finalExercise;

/*
 * The first one is going to be a superclass called Cake and it will have two fields, flavor and price. Go ahead and make getter and setter methods for both of these fields.
 * Next create a BirthdayCake class which will inherit from the Cake class and it has a field of its own called candles. Go ahead and include the getter and setter method for candles.
 * And then create a third class called WeddingCake which also inherits from Cake and has a field called tiers and you'll include a getter and setter method for this.
 * And then finally, a class called TasteTester which will test out your inheritance by printing the flavor and price of each of these types of cakes.
 */

public class TasteTester {

    public static void main(String args[]){

        WeddingCake wedding = new WeddingCake();
        wedding.setFlavor("Triple 000");
        wedding.setPrice(10);

        System.out.println("The wedding flavor: " + wedding.getFlavor());
        System.out.println("The wedding price: " + wedding.getPrice());

        BirthdayCake birthday = new BirthdayCake();
        birthday.setFlavor("Double 00");
        birthday.setPrice(10);

        System.out.println("The Birthday Cake flavor: " + birthday.getFlavor());
        System.out.println("The Birthday Cake price: " + birthday.getPrice());


    }
}
