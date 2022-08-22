package se.lexicon;
/*
2. Create a new list and populate it with the days of the week. Lastly, iterate through the list and print out each element separately.
 */
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionExer2 {

    public void exerTwo() {

        ArrayList<String> listOfWeekdays = new ArrayList<>();

        listOfWeekdays.add("Monday ");
        listOfWeekdays.add("Tuesday ");
        listOfWeekdays.add("Wednesday ");
        listOfWeekdays.add("Thursday ");
        listOfWeekdays.add("Friday ");
        listOfWeekdays.add("Saturday ");
        listOfWeekdays.add("Sunday ");
        System.out.println("Exer2:");

        Iterator<String> days = listOfWeekdays.iterator();
        while (days.hasNext())
        {
            System.out.println(days.next());
        }
    }
}