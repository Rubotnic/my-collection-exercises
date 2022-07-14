package se.lexicon;
/*
2. Create a new hashMap of types <String,String> and populate it with elements containing an email (String) and a name (String).
Next, create a new Set and populate it with the keys from the hashMap you created.
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CollectionChallenger2 {

    public void populateKey() {

        System.out.println("Extra challenge 2: ");

        HashMap<String, String> person = new HashMap <String, String>();

        person.put("james@mail.com", "James");
        person.put("bond@mail.com", "Bond");

        for(Map.Entry l : person.entrySet()) {
            System.out.println(l.getKey());

            HashSet<String> personKey = new HashSet<String>();

            personKey.add("Key: "+ l.getKey());

            System.out.println(personKey);
        }
    }
}
