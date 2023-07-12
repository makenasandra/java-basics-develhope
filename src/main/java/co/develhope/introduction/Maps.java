package co.develhope.introduction;

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
