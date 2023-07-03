package co.develhope.introduction;

public class Constructor {
    public static void main(String[] args){
        House house1 = new House();
        House house2 = new House();
    }


}

class House {
    String address;
    int numberOfFloors;

    House(){
        System.out.println("House created!");
    }
}
