package OOP.Encapsulation;

/**
 * Created by FrederikPetersen on 15/12/2016.
 */
public class User {
/*
The following code shows how capsulation works. we have used the access modifier to change the variables from public to private
and the only way to access them is through the Get/Set methods. this gives us control over what variables are in use.
 */
    private String name;
    private int age;
    private String occupation;

    public User(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
