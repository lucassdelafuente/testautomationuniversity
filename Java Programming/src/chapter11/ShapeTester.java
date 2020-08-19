package chapter11;

/*
 * ABSTRACTION
 * Abstraction is defined as something that exists in theory but does not have a concrete existence. In Java, we have the reserved word, abstract — which is a non-access modifier that can be used on classes and methods. It is used when you want to define a template for a class or a method, but do not intend for it to be used as is.
 * An abstract class is not designed to be instantiated. It's designed to be extended, thus pushing the burden of implementation onto the subclass.
 * Tips
 * - Abstract classes and methods are templates that are meant to be implemented by their subclasses.
 * - The classes and methods are declared abstract by using the abstract keyword.
 * - If a subclass inherits from an abstract class, it must implement its abstract methods or the class itself must be declared as abstract.
 * - Abstract classes cannot be instantiated. They are only to be used as a superclass. If even one method in a class is abstract, then the entire class must be declared abstract as well.
 */

public class ShapeTester {

    public static void main(String args[]){

        //You caN't create a instance for the abstract class
        //Shape rectangle = new Shape();

        Shape rectangle = new Rectangle(5, 7);
        rectangle.print();
        System.out.println(rectangle.calculateArea());
    }
}
