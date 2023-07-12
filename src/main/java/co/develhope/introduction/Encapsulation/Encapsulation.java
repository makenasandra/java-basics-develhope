package co.develhope.introduction.Encapsulation;

/**
 * Encapsulation
 * Achieve encapsulation using getters/setters for a class House that has the following instance variables:
 * an int floorsNumber
 * a string address
 * an array of strings residentsNames
 * use a tester class to:
 * set the values by asking the user to input them
 * for the residentsNames, the user will have to input a list of names separated by a comma (e.g. John,Lucy,Peter)
 * prints the house details using the getters and String.format()
 */

import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class Encapsulation {
    public static void main(String[] args){

        BigHouse newHouse = new BigHouse();
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter address: ");
        newHouse.setAddress(myScanner.nextLine());

        System.out.println("Enter number Of Floors: ");
        newHouse.setFloorsNumber(Integer.valueOf(myScanner.nextLine()));

        System.out.println("Enter residents Names separated by a comma (e.g. John,Lucy,Peter): ");
        String[] residentNames = myScanner.nextLine().split(",");
        newHouse.setResidentsNames(Arrays.asList(residentNames));

        System.out.println("House Details:\n" +
                newHouse.getAddress()+ "\n" +
                newHouse.getFloorsNumber()+ "\n" +
                newHouse.getResidentsNames());
    }
}

