package co.develhope.introduction.InheritancePolymorphism;

public class Animal {
    String animalName;
     Animal(String animalName){
     }

    public void animalSound(){
        System.out.println("Animal sound is: Roarr!");
    }

    public void animalSound(String intensity){
         if(intensity.equals("high")){
             System.out.println("Animal sound is: Roarrrrrrrr!");
         } else if (intensity.equals("low")) {
             System.out.println("Animal sound is: Roar");
         } else {
             System.out.println("Cannot reproduce it properly!");
         }

    }
}
