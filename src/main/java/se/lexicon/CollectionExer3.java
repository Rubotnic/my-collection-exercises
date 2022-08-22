package se.lexicon;
/*
3. Create a new list and populate it with the days of the week excluding THURSDAY. Lastly, insert the weekday THURSDAY into the right position in the list.
 */
import java.util.ArrayList;
import java.util.Arrays;

public class CollectionExer3 {

public void exerThird() {

    ArrayList<String> newListOfWeekdays = new ArrayList<>(Arrays.asList());

    newListOfWeekdays.add(0,"Monday ");
    newListOfWeekdays.add(1,"Tuesday ");
    newListOfWeekdays.add(2,"Wednesday ");
    newListOfWeekdays.add(3,"Friday ");
    newListOfWeekdays.add(4,"Saturday ");
    newListOfWeekdays.add(5,"Sunday ");

    newListOfWeekdays.add("Thursday");
    System.out.println("Exer3: " + newListOfWeekdays);
}
}