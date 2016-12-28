package Generics;

public class MainGenerics {
    public static void main(String[] args) {
        Integer[] iArray = {1,2,3,4,5};
        Character[] cArray = {'F','R','E','D','I'};

        printMethod(iArray);
        printMethod(cArray);

    }

    /*
    <T> = type parameter som er en gneric data form der er sat ind som sted fortræder i stedet for Arrayet der kommer ind.
     */
    public static <T> void printMethod(T[] x){
        for (T f: x){
            System.out.printf("%s" , f);
            System.out.println();
        }
    }
}
