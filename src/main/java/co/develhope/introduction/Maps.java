package co.develhope.introduction;

/**
 * Exercise: Map
 * Define a testing class with a main() method where you:
 *
 * create an HashMap that maps the numbers from 1 to 5 with their respective English names
 * create an HashMap that maps the odd number from 1 to 9 with their respective Italian names
 * merge (without using merge()) the second hashmap into the first one (duplicate keys' values are overwritten in the first HashMap)
 * print the modified firstHashMap
 * print on screen the value of the keys 5, 6, 7, 8 and 9
 * if there's no mapping for a specific key, print No associated value
 */

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<Integer, String> numbers = new HashMap<>();
        numbers.put(1, "one");
        numbers.put(2, "two");
        numbers.put(3, "three");
        numbers.put(4, "four");
        numbers.put(5, "five");

        Map<Integer, String> oddNumbers = new HashMap<>();
        numbers.put(1, "uno");
        numbers.put(7, "sette");
        numbers.put(3, "tre");
        numbers.put(9, "nove");
        numbers.put(5, "cinque");

        numbers.putAll(oddNumbers);

        for (int i = 5; i <= 9; i++) {
            if(numbers.get(i)==null){
                System.out.println("No associated value");
            } else {
                System.out.println(numbers.get(i));
            }

        }
    }
}
