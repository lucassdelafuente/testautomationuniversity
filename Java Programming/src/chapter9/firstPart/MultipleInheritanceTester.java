package chapter9.firstPart;

/*
 * Multiple Inheritance
 * Constructors are not technically members of a class and therefore they are not inherited.
 * All the public and protected methods and fields in a superclass, those are indeed inherited, but the private methods and fields are not.
 * Also, if there are any final methods, meaning methods that have the word final in the header, these are inherited but cannot be overridden.
 */

public class MultipleInheritanceTester {

    public static void main(String args[]){

        Mother mom = new Mother();
        mom.setName("Silvia");

        //The getGender is the Woman class because Mother extends to Woman
        System.out.println(mom.getName() + " is a " + mom.getGender());
    }
}
