//Declaracion del paquete
package chapter2;

import java.util.Scanner;

//La declaración de la clase
//En Naranja las plabras reservadas de JAVA, no se puede usar para nombrar otras cosas
public class GrossPayCalculator {

    //Método predeterminado y principal de JAVA
    //Es el comienzo, por acá va a empezar cuando se ejecute
    public static void main(String arg[]){

        //1. Get the number of hours worked
        System.out.println("Enter the number of hours employee worked");
        //Recibimos la entrada
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //2. Get the hourly pay rate
        System.out.println("Enter the employee's pay rate.");
        double rate = scanner.nextDouble();
        scanner.close();

        //3. Multiply hours and pay rate
        double grossPay = hours * rate;

        //4. Display result
        System.out.println("The employee's gross pay is: " + grossPay);

    }
}
