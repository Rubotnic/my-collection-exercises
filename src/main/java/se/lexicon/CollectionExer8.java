package se.lexicon;
/*
8. Create a new hashSet and populate it with random names. Lasty, sort the names in alphabetical order using only a Set or a child of Set.
*/
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionExer8 {

    public void exerEighth() {

        Set<String> randNames = new HashSet<>();
        randNames.add("Neo");
        randNames.add("Trinity");
        randNames.add("Morpheus");
        randNames.add("Niobe");

        TreeSet<String> stringList = new TreeSet<>(randNames);
        System.out.println("Exer8, Names are in alphabetic order: " + stringList);
    }
}
