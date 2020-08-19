package chapter9.firstPart;

/*
 * Inheritance
 * Inheritance is where one class becomes an extension of another class, therefore inheriting the members of that class.
 * There are two parties involved in an inheritance — a parent and a child. The parent is known as the superclass, or sometimes
 * also referred to as the parent class or base class. The child is known as the subclass, or sometimes referred to as the child class or the derived class.
 * When an inheritance relationship is created between these two classes, then the child class inherits the members of the parent class.
 * This allows classes to reuse data that already exists within other classes.
 * Subclasses should be a more specialized form of the superclass that they inherit from.
 *
 * Just to reiterate the RULES about constructors in inheritance:
 *  - A superclass's constructor is run before the subclass's constructor.
 *  - Explicit calls can be made to superclass's constructor from one of the subclass's constructors by using super().
 *  - Explicit calls to the superclass's constructor must be the first statement in the subclass's constructor.
 *  - If the superclass does not have a default constructor, the subclass must explicitly call one of its other constructors.
 */

import chapter9.firstPart.Employee;

public class InheritanceTester {

    public static void main(String[] args){

        /* I made a call to the default constructor of Employee.
         * However, the Person default constructor was called before the Employee default constructor. So, if we go inside this constructor, there's nothing here that explicitly says that we're going to go inside of the Person constructor. However, by us inheriting from the Person class, that constructor, that default constructor was called first.
         * And if we really think about it, it makes sense — we are inheriting from this class.
         */
        Employee employee = new Employee();

    }
}
