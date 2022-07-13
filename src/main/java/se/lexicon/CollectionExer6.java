package se.lexicon;
/*
6. Create a new hashSet and populate it with the days of the week. Then convert the hashSet to an arrayList.
 */
import java.util.ArrayList;
import java.util.HashSet;

public class CollectionExer6 {

    public void exerSixth() {

        HashSet<String> listOfWeekdays = new HashSet<>();

        listOfWeekdays.add("Monday");
        listOfWeekdays.add("Tuesday");
        listOfWeekdays.add("Wednesday");
        listOfWeekdays.add("Thursday");
        listOfWeekdays.add("Friday");
        listOfWeekdays.add("Saturday");
        listOfWeekdays.add("Sunday");

        System.out.println("Exer6, HashSet: " + listOfWeekdays);


        ArrayList<String> listArrWeekday = new ArrayList<>(listOfWeekdays);
        System.out.println("Exer6, ArrayList: " + listArrWeekday);
    }
}
