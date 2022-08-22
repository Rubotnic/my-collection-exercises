package se.lexicon;
/*
4. Create an array of type int with numbers: {1,4,4,2,6,7}.
Next, create an appropriate Collection and populate it with the content of the int array.
Lastly, print out each element in the Collection without duplicates.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CollectionChallenger4 {

    public void numbersArray() {

        System.out.print("Extra challenge 3: ");

        int[] intArray = new int[]{1, 4, 4, 2, 6, 7};
        Set<Integer> integerSet =  new HashSet<>();

        for (int i=0; i<intArray.length; i++){
            integerSet.add(intArray[i]);
        }
        for (Integer numb : integerSet){
            System.out.print(numb + " ");
        }


//        System.out.println("Extra challenge 4:");
//        int[] numbers = new int[]{1, 4, 4, 2, 6, 7};
//        Collection<Integer> colNumbers = new ArrayList<>(numbers.length);
//        colNumbers.add(numbers[0]);
//        colNumbers.add(numbers[1]);
//        colNumbers.add(numbers[3]);
//        colNumbers.add(numbers[4]);
//        colNumbers.add(numbers[5]);
//        System.out.println("Collection:"+ colNumbers);
    }
}