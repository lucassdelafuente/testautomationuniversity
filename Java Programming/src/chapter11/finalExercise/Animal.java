package chapter11.finalExercise;

// which declares an abstract method called makeSound(), and implements a non-abstract method called eat()

public abstract class Animal {

    abstract String makeSound();

    public void eat(String eat){
        System.out.println(eat);
    }
}
