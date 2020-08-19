package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * An exception is an unexpected event that occurs at runtime due to an error. Exceptions disrupt the normal flow of a program.
 * Handling Exceptions
 * You can handle exceptions within your code so that the program doesn't crash and so that you can provide a meaningful message in case of an error.
 * To do so, you use a try/catch clause.
 *The finally Clause
 * A finally clause can optionally be added below any catch clauses.
 * This clause is executed after try and after any catch clauses, even if the catch clauses don't execute.
 *
 * Stack Trace
 * Additionally, when an exception is caught, that exception has a stack trace as well, which will provide information about the error and also the path that the code took before getting there.
 * If your method has code that has the potential of throwing an exception, you must either catch that exception or rethrow it.
 * #Rethrowing Exceptions
 * When a method throws an exception, it is assumed that the exception will be caught and handled, or rethrown by any calling methods.
 */


public class ExceptionHandling {

    public static void main(String args[]){

        //createNewFile();
        //numbersExceptionHandling();
        //createNewFileRethrow();
    }

    public static void createNewFile(){
        File file = new File("resources/nonexistent.txt");
        try{
            file.createNewFile();

            //If you don't sure about that exception can throw you can use "Exception" instead of "IOException"
            //it is apply polymorphism because this is the superclass
        }catch (IOException e){
            System.out.println("Directory does not exist.");
            e.printStackTrace();
        }
    }

    public static void createNewFileRethrow() throws IOException{
        File file = new File("resources/nonexistent.txt");
        file.createNewFile();

    }

    public static void numbersExceptionHandling(){
        File file = new File("resources/numbers.txt");
        //OR IF YOU PUT Scanner fileReader = new Scanner(file) IN TRY
        // JAVA is who close de fileReader and you don't need the FINALLY BLOCK
        //This only work with a interfaces that can close automatically
        Scanner fileReader = null;
        try{
            fileReader = new Scanner(file);

            while(fileReader.hasNext()){
                double num = fileReader.nextDouble();
                System.out.println(num);
            }

        }catch(FileNotFoundException | InputMismatchException e){
            e.printStackTrace();
        }finally {
            fileReader.close();
        }

    }
}
