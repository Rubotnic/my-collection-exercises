package se.lexicon;
/*
2. Create a new list and populate it with the days of the week. Lastly, iterate through the list and print out each element separately.
 */
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionExer2 {

    public void exerTwo() {

        ArrayList<String> newListOfWeekdays = new ArrayList<>();

        newListOfWeekdays.add("Monday ");
        newListOfWeekdays.add("Tuesday ");
        newListOfWeekdays.add("Wednesday ");
        newListOfWeekdays.add("Thursday ");
        newListOfWeekdays.add("Friday ");
        newListOfWeekdays.add("Saturday ");
        newListOfWeekdays.add("Sunday ");

        System.out.println("Exer2:");

        Iterator<String> days = newListOfWeekdays.iterator();

        while (days.hasNext())
        {
            System.out.println(days.next());
        }
    }
}