package co.develhope.introduction.AbstractClasses;

public class Car extends Vehicle{

    private int numberOfDoors;
    private double carPrice;
    @Override
    public void showVehicleDetails(){
        super.showVehicleDetails();
        System.out.println("Additional car details: \nNumber of car doors: " + numberOfDoors + "\n");
    }
    @Override
    public void doVehicleSound(){
        System.out.println("Car sound: Vuuum!");
    }
    Car(int wheels, int doors, double price){
        this.numberOfWheels = wheels;
        this.numberOfDoors = doors;
        this.carPrice = price;
        this.type = "Car";
    }



}
