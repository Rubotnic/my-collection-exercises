package se.lexicon;
/*
12. Create a new class and call it Car.
Add fields for Id,Brand and Model + getters and setters Create a new hashMap of type <Integer,Car>
and populate it with elements containing an id(Integer) and a car object(Car). Lastly, print out only the car's brand.
 */
import java.util.HashMap;

public class CollectionExer12 {

    public void exerTwelfth(){

        Car saab = new Car(1, "Saab", "Super model"); //object
        Car volvo = new Car(2, "Volvo", "Student model"); //object

        HashMap<Integer, Car> carInfo = new HashMap<>();

        carInfo.put(volvo.getId(), volvo);
        carInfo.put(saab.getId(), saab);

        System.out.println(carInfo);

        System.out.println("Exer12: " + volvo.getBrand() + " & " + saab.getBrand());
    }
}

