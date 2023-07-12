package co.develhope.introduction;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> daysOfTheWeek = new HashSet<String>();
        daysOfTheWeek.add("Monday");
        daysOfTheWeek.add("Tuesday");
        daysOfTheWeek.add("Wednesday");
        daysOfTheWeek.add("Thursday");
        daysOfTheWeek.add("Friday");
        daysOfTheWeek.add("Saturday");
        daysOfTheWeek.add("Sunday");

        Set<String> daysOfWeek2 = new TreeSet<>();
        daysOfWeek2.addAll(daysOfTheWeek);
        System.out.println(daysOfTheWeek);
        System.out.println(daysOfWeek2);
        System.out.println("Is the first Set equal to the second one? " + daysOfTheWeek.equals(daysOfWeek2));

    }
}
