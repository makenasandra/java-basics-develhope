package co.develhope.introduction.ClassesAndObjects;

class Programmer {
    String name;
    int age;
    boolean wearsGlasses;

    public void drinkCoffee() {
        System.out.println("Espresso is the secret!");
    }

    public void printDetails() {
        System.out.printf("%s is a %d Here-yo programmer %n", name, age);
    }

    public void hasGlasses() {
        System.out.println("Is " + name + " wearing glasses? " + wearsGlasses);
    }
}
