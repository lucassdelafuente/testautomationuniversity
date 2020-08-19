package chapter10.finalExercise;

public class Banana extends Fruit {

    public Banana(){
        setCalories(30);
    }

    public void peel(){
        System.out.println("Peel the banana");
    }

    @Override
    public void makeJuice(){
        System.out.println("The Banana Juice!");
    }
}
