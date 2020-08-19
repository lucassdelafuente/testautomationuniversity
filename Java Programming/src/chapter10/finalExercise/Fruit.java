package chapter10.finalExercise;

// This class should contain a field called calories and a method called makeJuice(), which prints a statement — something like “juice is made” - just something generic.

public class Fruit {

    private double calories;

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public void makeJuice(){
        System.out.println("Juice is made");
    }
}
