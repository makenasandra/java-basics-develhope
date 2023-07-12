package co.develhope.introduction;

import java.util.SplittableRandom;

/**
 * Enums
 * Exercise: Enumerations
 * create an enumeration Month with all the name of the months
 * iterate all the values of the enumeration, printing the name of the month followed by:
 * ends with y if the name ends with Y
 * doesn't end with y if the name doesn't end with y
 */
public class Enums {
    public static void main(String[] args) {
       enum Month { JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER}

        for (Month month:Month.values()) {
            if(String.valueOf(month).endsWith("Y")){
                System.out.println(month + " ends with y");
            } else {
                System.out.println(month + " doesn't end with y ");
            }
        }
    }
}
