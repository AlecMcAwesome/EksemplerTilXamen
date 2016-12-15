package OOP.Encapsulation;

/**
 * Created by FrederikPetersen on 15/12/2016.
 */
public class mainOop {

    public static void main(String[] args) {
        User user = new User();

        user.setAge(26);
        user.setName("Poul");
        user.setOccupation("Meme Expert");
        System.out.println(user.getName() + " " + user.getAge() + " " + user.getOccupation());
        System.out.println(" ");

        Manager manager1 = new Manager();

        manager1.setName("Erik");
        manager1.setSalary(420);

        System.out.println(user.getName() + "'s " + "manager is " + manager1.getName());
        System.out.println(" ");
        System.out.println(manager1.getName() + " earns " + manager1.getSalary() + " a month");

    }
}
