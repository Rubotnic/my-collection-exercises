package se.lexicon;
/*
9. Create a new hashMap of type <Integer,String> and populate it with elements containing an id(Integer) and a car brand(String). Lastly, print out the entire hashMap.
*/
import java.util.HashMap;

public class CollectionExer9 {

    public void exerNinth() {

        HashMap<Integer, String> idBrand = new HashMap<>();

        idBrand.put(1,"Saab");
        idBrand.put(2,"Volvo");
        idBrand.put(3,"Polestar");
        idBrand.put(4,"Nilsson");

        System.out.println("Exer9: " + idBrand);
    }
}
