package ADT;

import java.util.ArrayList;

/**
 * Created by FrederikPetersen on 28/12/2016.
 */
public class ArrayListForXamen<T> {

    // T = type parameter
    private T[] data;
    private int size;

    private void showList(){
        data = (T[]) new Object[4];
        size = 0;
    }

}
