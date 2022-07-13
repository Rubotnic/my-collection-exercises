package se.lexicon;
/*
10. Create a new hashMap of type <Integer,String> and populate it with elements containing an id(Integer) and a car brand(String). Lastly, print out only the keys.
*/
import java.util.HashMap;
import java.util.Map;

public class CollectionExer10 {

    public void exerTenth() {

        HashMap<Integer, String> idBrand = new HashMap<>();

        idBrand.put(1, "Saab");
        idBrand.put(2, "Volvo");
        idBrand.put(3, "Polestar");
        idBrand.put(4, "Nilsson");

        System.out.println("Exer10:");

        for (Map.Entry m : idBrand.entrySet()) {
            System.out.println("Key:" + m.getKey());
        }
    }
}
