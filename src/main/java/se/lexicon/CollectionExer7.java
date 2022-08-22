package se.lexicon;
/*
7. Create a new hashSet and populate it with random names. Then convert the hashSet to an arrayList. Lastly, manually sort the list in alphabetical order and print it out.
 */
import java.util.*;

public class CollectionExer7 {

        public void exerSeventh() {

            Set<String> randNamesList = new HashSet<>();
            randNamesList.add("Neo");
            randNamesList.add("Trinity");
            randNamesList.add("Morpheus");
            randNamesList.add("Niobe");

            List<String> stringList = new ArrayList<>(randNamesList);
            for (int i=0; i<stringList.size(); i++) {
                for (int j=i; j>0; j--) {
                    if (stringList.get(j).charAt(0) < stringList.get(j-1).charAt(0)) {
                        String temp = stringList.get(j);
                        stringList.set(j, stringList.get(j-1));
                        stringList.set(j-1,temp);
                    }
                }
            }
            System.out.println("Exer7, Names are in alphabetic order: " + stringList);

        }
}
