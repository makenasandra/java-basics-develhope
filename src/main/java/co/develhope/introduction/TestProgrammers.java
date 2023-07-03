package co.develhope.introduction;

public class TestProgrammers{
    public static void main(String[] args){
        Programmer firstPro = new Programmer();
        Programmer secondPro = new Programmer();

        firstPro.name = "Ernesto";
        firstPro.age =34;
        firstPro.wearsGlasses = true;
        secondPro.name= "Strawberry";
        secondPro.age = 54;
        secondPro.wearsGlasses = false;

        firstPro. drinkCoffee();
        firstPro.printDetails();

        secondPro.printDetails();
        secondPro.hasGlasses();

    }
};

class Programmer{
    String name;
    int age;
    boolean wearsGlasses;

    public Programmer(){
        this.name = name;
        this.age = age;
        this.wearsGlasses = wearsGlasses;
    }

    public void drinkCoffee(){
        System.out.println("Espresso is the secret!");
    }

    public void printDetails(){
        System.out.printf("%s is a %d Here-yo programmer %n", this.name, this.age);
    }

    public void hasGlasses (){
        System.out.println("Is " + this.name + " wearing glasses? " + this.wearsGlasses);
    }
}