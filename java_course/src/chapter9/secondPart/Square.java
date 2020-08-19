package chapter9.secondPart;

public class Square extends Rectangle {

    //Indicate that is a override method
    //It is to change the behavior of an inherited method
    // Without inheritance, methods are overloaded within the same class. With inheritance, a subclass can overload a method that it inherited from the superclass
    @Override
    public double calculatePerimeter(){
        return sides * lenght;
    }

    public void print(String what){
        System.out.println("I am a " + what);
    }
}
