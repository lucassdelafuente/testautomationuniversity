package chapter11;

/*
 * INTERFACE
 * An interface is similar to an abstract class, except that in an abstract class there can be some methods that are implemented.
 * However, an interface consists of all abstract methods. Because all of the methods of an interface are abstract by nature, there's no need to declare the methods as abstract. It's just a given.
 * The other way interfaces are different from abstract classes is that interfaces are implemented, not extended.
 * Any class that implements an interface must implement all of its methods, or it must declare itself as an abstract class.
 *
 * TIPS
 *  - Interfaces cannot be instantiated.
 *  - Interfaces are implemented, not extended.
 *  - Any class that implements an interface must implement all of its methods or it must declare itself abstract.
 *  - Methods in an interface must be default or abstract (there's no explicit declaration needed for abstract methods)
 * Also notice that we didn't put an access modifier on the methods in an interface, either. That's because by default they're all public.
 */

public interface Product {

    double getPrice();
    void setPrice(double price);

    String getName();
    void setName(String name);

    String getColor();
    void setColor(String color);

    // I told you that all of the methods inside of an interface must be abstract, and that was true until Java version 8.
    //This is only for Java 8
    // You can declare a method with "default" and the inherited class will not be forced to overwrite it
    default String getBarcode(){
        return "no barcode";
    }


    int size = 0;

}
