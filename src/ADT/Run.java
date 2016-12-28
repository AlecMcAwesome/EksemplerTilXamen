package ADT;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Run {
    public static void main(String[] args) {

        ArrayList<String> arrayListEks = new ArrayList<>();

        arrayListEks.add("Lone");
        arrayListEks.add("Mikkel");
        arrayListEks.add("Ole");
        arrayListEks.add("Sven");
        arrayListEks.add("Lone");

        for (String value : arrayListEks) {
            System.out.println(value);
        }

        Set<String> set = new HashSet<>(arrayListEks);
        for (String newValue: set) {
            System.out.println(newValue);
        }
    }
}
