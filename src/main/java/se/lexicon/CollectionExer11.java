package se.lexicon;
/*
11. Create a new hashMap of type <Integer,String> and populate it with elements containing an id(Integer) and a car brand(String). Lastly, print out only the values.
*/
import java.util.HashMap;
import java.util.Map;

public class CollectionExer11 {

    public void exerEleventh() {

        HashMap<Integer, String> idBrand = new HashMap<>();

        idBrand.put(1, "Saab");
        idBrand.put(2, "Volvo");
        idBrand.put(3, "Polestar");
        idBrand.put(4, "Nilsson");

        System.out.println("Exer11: " + (idBrand.values()));

//        for (Map.Entry m : idBrand.entrySet()) {
//            System.out.println("Value:" + m.getValue());
//        }
    }
}