package co.develhope.introduction;

/**
 * Exercise: Map and Set
 * Define a testing class with a main() method where you:
 *
 * create a Map called months where the key is the name of the month and value is the cardinal number of the month
 * populate the Map, being sure to preserve the insertion order
 * obtain and print a Set view of the keys that are in months using a specific Map method
 * then convert months using a Collection of integers:
 * into a List (and print it) of integers called cardinalMonth where you insert all the values of the Map
 * into an array (and print it) of integers called cardinalMonthArray where you insert all the values of the Map
 */

import java.sql.Array;
import java.util.*;

public class MapAndSet {
    public static void main(String[] args) {
        Map<String, Integer >  months = new LinkedHashMap<>();
        months.put("January", 1);
        months.put("February", 2);
        months.put("March", 3);
        months.put("April", 4);
        months.put("May", 5);
        months.put("June", 6);
        months.put("July", 7);
        months.put("August", 8);
        months.put("September", 9);
        months.put("October", 10);
        months.put("November", 11);
        months.put("December", 12);

        //a Set view of the keys that are in months
        System.out.println(months.keySet());
        //convert months using a Collection of integers:
        //into a List (and print it) of integers called cardinalMonth where you insert all the values of the Map
        Collection<Integer> cardinalMonth = new ArrayList<Integer>();

        cardinalMonth.addAll(months.values());

        System.out.println("List of integers: "+ cardinalMonth);

        Integer[] cardinalMonthArray = cardinalMonth.toArray(new Integer[0]);

        for (int i = 0; i < cardinalMonthArray.length; i++) {
            Integer data = cardinalMonthArray[i];

            // Printing elements of an array
            System.out.print(data + " ");
        }
    }
}
