package Collections;

/**
 * Created by FrederikPetersen on 28/12/2016.
 */
public class CollectionsRun {
    public static void main(String[] args) {
       /* StackClass stackClass = new StackClass();

        stackClass.addToStack("Michael");
        stackClass.addToStack("Line");
        stackClass.addToStack("Sven");
        stackClass.addToStack("Mikkel");

        stackClass.showStack();
        System.out.println("_________");
        stackClass.showStackSize();
        stackClass.removeFromStack();
        System.out.println("_________");
        stackClass.showStack();
        System.out.println("_________");
        stackClass.showStackSize();
        System.out.println("_________");
        stackClass.isStackEmpty();*/

        //_______________________________________________________________________//


        QueueClass queueClass = new QueueClass();

        queueClass.addToQueue(33);
        queueClass.addToQueue(44);
        queueClass.addToQueue(24);
        queueClass.addToQueue(68);

        System.out.println("_________");
        queueClass.showFirstNumber();
        System.out.println("_________");
        queueClass.removeFromQueue();
        System.out.println("_________");
        queueClass.showSize();
        System.out.println("_________");
        queueClass.isItEmpty();

    }
}
