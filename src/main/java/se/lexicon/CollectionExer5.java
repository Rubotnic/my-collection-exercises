package se.lexicon;
/*
5. Create a new hashset and populate it with the days of the week. Lastly, print the set out and pay attention to the order of the elements.
 */
import java.util.HashSet;

public class CollectionExer5 {

    public void exerFifth() {

        HashSet<String> listOfWeekdays = new HashSet<>();

        listOfWeekdays.add("Monday");
        listOfWeekdays.add("Tuesday");
        listOfWeekdays.add("Wednesday");
        listOfWeekdays.add("Thursday");
        listOfWeekdays.add("Friday");
        listOfWeekdays.add("Saturday");
        listOfWeekdays.add("Sunday");

        System.out.println("Exer5: " + listOfWeekdays);
    }
}
