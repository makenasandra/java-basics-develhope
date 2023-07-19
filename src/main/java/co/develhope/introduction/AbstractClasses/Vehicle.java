package co.develhope.introduction.AbstractClasses;

abstract class Vehicle {
    String type;
    int numberOfWheels;

    public void showVehicleDetails(){
        System.out.println("Vehicle Details: \nVehicle Type: " + type + "\nNo. of wheels: " + numberOfWheels + "\n");
    }

    abstract void doVehicleSound();
}
