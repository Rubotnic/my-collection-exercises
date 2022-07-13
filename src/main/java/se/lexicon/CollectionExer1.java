package se.lexicon;
/*
1. Create a new list and populate it with the days of the week. Lastly, print the out the list.
*/
import java.util.ArrayList;

public class CollectionExer1 {
    public void exerOne(){

        ArrayList<String> listOfWeekdays = new ArrayList<>();

        listOfWeekdays.add("Monday");
        listOfWeekdays.add("Tuesday");
        listOfWeekdays.add("Wednesday");
        listOfWeekdays.add("Thursday");
        listOfWeekdays.add("Friday");
        listOfWeekdays.add("Saturday");
        listOfWeekdays.add("Sunday");

        System.out.println("Exer 1: " + listOfWeekdays);
    }
}