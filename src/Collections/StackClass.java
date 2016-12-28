package Collections;

import java.util.Stack;

/**
 * Created by FrederikPetersen on 27/12/2016.
 */
public class StackClass {

    Stack<String> stackXempl = new Stack<>();

    public void addToStack(String namex) {
        stackXempl.push(namex);
    }


//pop metoden fjerner den øverste variabel fra vores stack og viser den fjernede variabel
    public void removeFromStack(){
        stackXempl.pop();
    }

    public void showStack() {
        for (String i:stackXempl) {
            System.out.println(i);
        }
    }

    public void showStackSize(){
        System.out.println(stackXempl.size());
    }

    public void isStackEmpty(){
        if (stackXempl.isEmpty() == true){
            System.out.println("The stack is empty" + stackXempl.size());
        }else {
            System.out.println("The stack contains " + stackXempl.size());
        }
    }

}
