package chapter6;

/*
 * This class represent a Object, in this case a Rectangle, it has a characteristics and actions.
 * You can see that it hasn't a main method.
 * Object are structures which contain data in the form of fields and methods.
 */

public class Rectangle {

    //The encapsulation says that the variables should be private
    // and the methods should be public

    //Rectangle fields
    private double length;
    private double width;

    //Default constructor, the purpose is initialize an object when it is created
    //The name must be the same of the class
    //This is useful when you need use the object but you can't set the length and width
    //Set a default values
    public Rectangle(){
        //Here it isn't necessary use "this" because you haven't a parameters
        length = 0;
        width = 0;
    }

    //Other constructor when the people know exactly the length and width value
    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);

        //or
        //this.length = lenght

    }


    //get and set methods are useful when you need set that parameters in other classes
    public double getLength(){
        return length;
    }

    public void setLength(double length){
        //this is the actual object in the class
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        //this is the actual object in the class
        //because we need talk about the global variable and not the parameter variable
        this.width = width;
    }

    //Actions
    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    public double calculateArea(){
        return length * width;
    }
}
