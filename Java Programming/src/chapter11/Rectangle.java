package chapter11;

/*
 * So, we've inherited an abstract method when we extended Shape — which means we have to provide the implementation for that abstract method.
 * If, for example, we didn't want to provide the implementation, then we don't have to do it. But this class itself would then need to be declared as abstract because it contains abstract methods. Technically, because they were inherited.
 */

public class Rectangle extends Shape {

    private double length;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    private double width;

    public Rectangle(double lenght, double width){
        setLength(lenght);
        setWidth(width);
    }

    //Because extends of Shape and it is a abstract class
    @Override
    double calculateArea() {
        return length * width;
    }
}
