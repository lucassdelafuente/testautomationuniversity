package chapter11.finalExercise;

/* Your optional exercise for this chapter is to create an abstract class called Animal,
 * which declares an abstract method called makeSound(), and implements a non-abstract method called eat().
 * Then create a Pig class and a Duck class that both extend the Animal class.
 * Finally, create a Farm class to test these implementations.
 */

public class Farm {

    public static void main(String args[]){

        Animal pig = new Pig();
        System.out.println(pig.makeSound());
        pig.eat("meat");

        Animal duck = new Duck();
        System.out.println(duck.makeSound());


    }
}
