package chapter13;

/*
 * Your optional exercise for this chapter is to write the following statement — int c = 30/0 — within a program and execute it.
 * When you execute this, you'll see an exception, so I want you to update that program to handle the exception.
 * Then print a statement after the division to say, "Division is fun." This statement should be outputted no matter what happens in your program.
 */

public class FinalExercise {

    public static void main(String args[]){

        runTest();
    }

    public static void runTest(){

        try{
            int c = 30/0;
        }catch(ArithmeticException e){
            System.out.println("Dividing by zero is not permitted");
        }finally{
            System.out.println("Division is fun!");
        }

    }
}
