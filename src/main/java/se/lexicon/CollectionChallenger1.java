package se.lexicon;
/*
1. Create an empty set and populate it with the all the days of the week.
Next create a second set and populate it with ONLY the weekend days (SATURDAY and SUNDAY).
Lastly, compare the two sets and retain in the first set only those days that are the same in both sets.
 */
import java.util.HashSet;

public class CollectionChallenger1 {

    public void removeDays() {

        System.out.println("Extra challenge 1: ");

        HashSet<String> allWeekdays = new HashSet<>();

        allWeekdays.add("Monday ");
        allWeekdays.add("Tuesday ");
        allWeekdays.add("Wednesday ");
        allWeekdays.add("Thursday ");
        allWeekdays.add("Friday ");
        allWeekdays.add("Saturday ");//
        allWeekdays.add("Sunday ");//

        HashSet<String> notAllWeekdays = new HashSet<>();

        notAllWeekdays.add("Saturday ");
        notAllWeekdays.add("Sunday ");

        allWeekdays.retainAll(notAllWeekdays);
        System.out.println(allWeekdays);
    }
}

