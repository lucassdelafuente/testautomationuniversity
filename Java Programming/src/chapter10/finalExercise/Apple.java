package chapter10.finalExercise;

// Then create two subclasses of the Fruit class. For example, you can do Apple and Banana, or Orange and Lemon, whatever you would like to do.
// And then create methods within these classes that are specific to them. So, if you're going to do the Apple class, then do something like removeSeeds().
// And then set the calories within the constructors of these subclasses.
// Override the makeJuice() method to print the specific type of juice that's going to be made.

public class Apple extends Fruit {

    public Apple(){
        setCalories(25);
    }

    @Override
    public void makeJuice(){
        System.out.println("The best Apple juice.");
    }

    public void removeSeeds(){
        System.out.println("Remove seeds please.");
    }
}
