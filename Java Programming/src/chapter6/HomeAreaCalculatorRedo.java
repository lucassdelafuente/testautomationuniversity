package chapter6;

import java.util.Scanner;

/*
 * OBJECTS AS METHOD PARAMETERS AND RETURN TYPES
 * Static-> When you don't need create a new instance of that class but you need to use it.
 * You can call that class without create a Object of that class.
 *
 * Static methods are ones that can be called without instantiating its class.
 * They do not have knowledge of state within the class.
 *
 * For a static method to be able to call a non-static method, it must do so by
 * Using an object of the type in which the non-static method belongs
 */

//Static-> When you don't need create a new instance of that class but you need to use it.
// You can call that class without create a Object of that class.
//
public class HomeAreaCalculatorRedo {

    Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){

        //Create a instance that the same class to access to the method that isn't static
        //The default constructor in Java always is defined implicitly
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen, bathroom);

        System.out.println("The total area is: " + area);

        calculator.scanner.close();

    }

    //Return a Rectangule object
    //In this case you can return more than one value because you need return a Object
    public Rectangle getRoom(){

        System.out.println("Enter the length of your room:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room:");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }

    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){

        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
