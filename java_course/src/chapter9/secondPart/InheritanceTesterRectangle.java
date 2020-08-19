package chapter9.secondPart;

/*
 * Overriding Inherited Methods
 * For example, a square is a rectangle, meaning we could have a Square class that inherits from a Rectangle class.
 * And let's say one of the methods that was inherited was to calculate the perimeter.
 * Well, the formula for calculating the perimeter of a square is different than the formula for calculating the perimeter of a rectangle.
 * So, while it's great that the Square class inherits this method, that class needs to change the behavior of that method. This is called overriding a method.
 */

public class InheritanceTesterRectangle {

    public static void main(String args[]){

        Rectangle rectangle = new Rectangle();
        //Appears one method to print
        rectangle.print();

        Square square = new Square();
        //Appears two method to print
        square.print();
    }

    public static void testSquareOverride(){
        Rectangle rectangle = new Rectangle();
        rectangle.setLenght(4);
        rectangle.setWidth(8);
        System.out.println(rectangle.calculatePerimeter());

        Square square = new Square();
        square.setLenght(4);
        square.setWidth(8);
        System.out.println(square.calculatePerimeter());

    }
}
