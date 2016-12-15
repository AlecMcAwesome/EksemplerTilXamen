package OOP.Abstraction;

/**
 * Created by FrederikPetersen on 15/12/2016.
 */
public class Run {
    public static void main(String[] args) {

        /*
        Abstract classes cannot be instantiated
        Example: AbstractTestClass abstractTestClass = new AbstractTestClass();
         */

        SubClass subClass = new SubClass();
        // her går i trin igennem klasserne. først subclass og derefter AbsctractTestClass
        System.out.println(subClass.myInt);
    }

}
