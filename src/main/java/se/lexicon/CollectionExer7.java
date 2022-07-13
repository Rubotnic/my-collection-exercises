package se.lexicon;
/*
7. Create a new hashSet and populate it with random names. Then convert the hashSet to an arrayList. Lastly, manually sort the list in alphabetical order and print it out.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class CollectionExer7 {

        public void exerSeventh() {

            HashSet<String> randNames = new HashSet<>();

            randNames.add("Neo");
            randNames.add("Trinity");
            randNames.add("Morpheus");
            randNames.add("Niobe");

            ArrayList<String> listArrNames = new ArrayList<>(randNames);
            System.out.println("ArrayList: " + listArrNames);

            ArrayList<String> namesSort = new ArrayList<>(listArrNames);
            Collections.sort(namesSort);

            System.out.println("Exer7, Names are in alphabetic order: " + namesSort);
        }
}
