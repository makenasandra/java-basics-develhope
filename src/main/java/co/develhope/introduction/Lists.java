package co.develhope.introduction;

/**
 * Lists
 * -Define a testing class with a main() method where you: -Create a not mutable List of strings called cityNames using asList() that you populate with 3 city names -Try to add a 4th city name at the end of the List -If you get an exception, try to understand why and eventually comment the faulty code -Try to change the 2nd item of the array, entering the value Tegucigalpa print the content of cityNames -Define a mutable empty List of strings called kingsOfRome -Insert the names of the 7 kings of Rome into the mutable list -Print the content of kingsOfRome -Convert kingsOfRome into an array called kingsOfRomeArray, using new String[0] to determine the type of the array -.Change the value of the 7th king in kingsOfRomeArray with the value Lucius Tarquinius Supercar
 *
 * Print the content of kingsOfRomeArray
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Lists {
    public static void main(String[] args)
    {
        List<String> cityNames  =  Arrays.asList("Nairobi", "Mombasa", "Kisumu");

        //cityNames.add("Nakuru"); - list is immutable thus elements cannot be added

        cityNames.set(1, "Tegucigalpa");

        System.out.println(cityNames);

        ArrayList<String> kingsOfRome  = new ArrayList<String>(); // Create an ArrayList object
        kingsOfRome.add("Romulus");
        kingsOfRome.add("Numa Pompilius");
        kingsOfRome.add("Tullus Hostilius");
        kingsOfRome.add("Ancus Marcius");
        kingsOfRome.add("Lucius Tarquinius Priscus");
        kingsOfRome.add("Servius Tullius");
        kingsOfRome.add("Lucius Tarquinius Superbus");

        System.out.println(kingsOfRome);

        //Declaring Array with Equal Size to the List
        String[]kingsOfRomeArray = new String [kingsOfRome.size()];

        //Converting List to Array
        kingsOfRome.toArray(kingsOfRomeArray);

        kingsOfRomeArray[kingsOfRomeArray.length-1] = "Lucius Tarquinius Supercar";

        System.out.println(Arrays.toString(kingsOfRomeArray));

    }
}
