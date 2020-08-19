package chapter10;

/*
 * POLYMORPHISM
 * Polymorphism is the ability to take multiple forms. Specifically, in object-oriented programming, polymorphism is where a subclass can define their own unique behaviors,
 * and yet share some of the same behaviors of their superclass.
 *
 * An object can have a superclass type and a subclass instance.
 * Polymorphic objects can only access the methods of their type, not of their instance, unless you use casting.
 * If a method is overwritten by the subclass, the polymorphic object will execute the overwritten method at runtime.
 * The instanceof operator is used to determine if an object is an instance of a certain class.
 */

public class Zoo {

    public static void main(String[] args){

        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        //This it's OK because Dog extends to Animal
        feed(rocky);

        //With polymorphism
        Animal sasha = new Dog();
        sasha.makeSound();
        feed(sasha);

        sasha = new Cat();
        sasha.makeSound();
        //In this specific call shasha is convert in Cat for use your methods
        ((Cat) sasha).scratch();
        feed(sasha);
    }

    public static void feed(Animal animal){

        //instanceof is to check if the left part is an instance for the right part
        if(animal instanceof Dog){
            System.out.println("Here's your dog food.");
        }
        else if(animal instanceof Cat){
            System.out.println("Here's your cat food.");
        }
    }
}
