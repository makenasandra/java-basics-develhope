package co.develhope.introduction.AbstractClasses;

public class Boat extends Vehicle{
    double maxKnotsSpeed;
    int boatKilosWeight;

    @Override
    public void doVehicleSound(){
        System.out.println("Boat sound: Trrrrr!");
    }

    Boat (double maxSpeed, int weight){
        this.boatKilosWeight = weight;
        this.maxKnotsSpeed = maxSpeed;
        this.type = "Boat";
    }

    public String getBoatWeightAndSpeed(){
        return "Total boat kilos weight= " + this.boatKilosWeight + "\nThe maximum knots speed: " + this.maxKnotsSpeed;
    }
}
