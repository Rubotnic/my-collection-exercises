package se.lexicon.CollectionChallenger3;
/*
3. Create a new class and call it SuperHero. Add fields for Id,Name and Age + getters and setters. Have the class implement the Comparable interface.
Implement the override method and have it compare the AGE of the superhero. Next, create a new arrayList of type SuperHero. Sort the list by age and print out each element.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionChallenger3 {

        public void allSuperHeros () {

            SuperHero superman = new SuperHero(1, "Superman", 18);
            SuperHero spiderman = new SuperHero(2, "Spiderman", 17);
            SuperHero wonderfulWomen = new SuperHero(3, "Wonderfulwomen", 19);

            System.out.println("Extra challenge 3:");

            ArrayList<Integer> superHero = new ArrayList<>();

            superHero.add(spiderman.getAge());
            superHero.add(superman.getAge());
            superHero.add(wonderfulWomen.getAge());

            Collections.sort(superHero);

            Iterator itr = superHero.iterator();
            while (itr.hasNext()){
                System.out.println("Age: "+ (itr.next()));
            }
        }
    }