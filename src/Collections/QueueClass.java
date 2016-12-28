package Collections;

import java.util.*;

/**
 * Created by FrederikPetersen on 28/12/2016.
 */
public class QueueClass {

    Queue<Integer> queue = new LinkedList<>();

    public void addToQueue(int number){
        queue.add(number);
        System.out.println(queue);
    }

    public void removeFromQueue(){
        queue.remove();
        System.out.println(queue);
    }

    public void showFirstNumber(){
        System.out.println(queue.peek());
    }

    public void showSize(){
        System.out.println(queue.size());
    }

    public void isItEmpty(){
        String trueString = "It is Not Empty it contains: ";
        String falseString = "It is empty!";
        if (!queue.isEmpty()){
            System.out.println(trueString);
            showSize();
        }else {
            System.out.println(falseString);
        }
    }

}
