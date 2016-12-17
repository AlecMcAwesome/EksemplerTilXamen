package OOP.Polymorphism;

public class PolySubClass extends PolySuperClass implements polyInterface {


    public void showName() {
        System.out.println(name);
    }

    public void showNumber() {
        System.out.println(numberFromSuper);
    }
}
