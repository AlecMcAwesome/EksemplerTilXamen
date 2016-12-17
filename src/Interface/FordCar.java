package Interface;

/**
 * Created by FrederikPetersen on 17/12/2016.
 */
public class FordCar implements Cars {

    public String carName = "Ford";
    public int newGear = 5;
    public String color = "Blue";
    public int newTopSteed = 250;

    public void carName() {
        System.out.println("The cars name is: " + carName);
    }

    public void numberOfGears() {
        System.out.println("This car has: " + newGear + " gears.");
    }

    public void showColor() {
        System.out.println("The color is: " + color);
    }

    public void topSpeed() {
        System.out.println("and the top speed is: " + newTopSteed);
    }


}
