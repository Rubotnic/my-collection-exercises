package se.lexicon;
/*
4. Create a new list and populate it with the days of the week. Then create a new list out of the first three elements of the first list using a subList.
 */
import java.util.ArrayList;
public class CollectionExer4 {

    public void exerFourth() {

        ArrayList<String> listOfWeekdays = new ArrayList<>( );

        listOfWeekdays.add("Monday");
        listOfWeekdays.add("Tuesday");
        listOfWeekdays.add("Wednesday");
        listOfWeekdays.add("Thursday");
        listOfWeekdays.add("Friday");
        listOfWeekdays.add("Saturday");
        listOfWeekdays.add("Sunday");

        System.out.println("Exer4: " + listOfWeekdays.subList(0, 3));
    }
}

