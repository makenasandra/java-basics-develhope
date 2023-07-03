package co.develhope.introduction;

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

class BigHouse{
    private int floorsNumber;
    private String address;
    private List<String> residentsNames;

    public int getFloorsNumber() {
        return floorsNumber;
    }

    public void setFloorsNumber(int floorsNumber) {
        this.floorsNumber = floorsNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getResidentsNames() {
        return residentsNames;
    }

    public void setResidentsNames(List<String> residentsNames) {
        this.residentsNames = residentsNames;
    }
}
