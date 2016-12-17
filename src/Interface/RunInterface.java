package Interface;

/**
 * Created by FrederikPetersen on 17/12/2016.
 */
public class RunInterface {
    public static void main(String[] args) {

        FordCar fordCar = new FordCar();

        fordCar.carName();
        fordCar.numberOfGears();
        fordCar.showColor();
        fordCar.topSpeed();
    }
}
