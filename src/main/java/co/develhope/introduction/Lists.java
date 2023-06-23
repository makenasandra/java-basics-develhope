package co.develhope.introduction;

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
