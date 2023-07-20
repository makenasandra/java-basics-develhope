package co.develhope.introduction.MethodsOverriding;

/**
 * Exercise: default methods override
 *         Define a Smartphone class that implements Cloneable and has:
 *
 *         5 attributes:
 *         a string brandName
 *         a string modelName
 *         an int batterymAh
 *         an attribute producerPrice of type SmartphonePrice
 *         an attribute retailPrice of type SmartphonePrice
 *         [using IntelliJ] an override of the toString() method in order to print all the attributes of a Smartphone object
 *         [using IntelliJ] an override of the equals() method that check all the 5 attributes to establish if two Smartphone objects are equal
 *         [using IntelliJ] an override of the hashCode(), using all the 5 attributes
 *         [using IntelliJ] an override of the clone() method (that will have to be public) where:
 *         a clonedSmartphone is generated using super.clone()
 *         there's an assignment to the clonedSmartphone.producerPrice
 *         there's an assignment to the clonedSmartphone.retailPrice
 *         the return value is a Smartphone object
 *         a constructor method that accepts 5 params (brand, model, battery, prodP, retailP) and assign the right values to the object
 *         define a SmartphonePrice class that implements Cloneable and has:
 *         2 attributes:
 *         a string priceType
 *         a double priceInEuros
 *         [using IntelliJ] an override of the clone() method (that will have to be public) where:
 *         a clonedSmartphonePrice is generated using super.clone()
 *         the return value is a SmartphonePrice object
 *         [using IntelliJ] an override of the toString() method for returning an informative String about the 2 SmartphonePrice attributes
 *         [using IntelliJ] an override of the equals() method that check the 2 attributes to establish if two SmartphonePrice objects are equal
 *         [using IntelliJ] an override of the hashCode(), using the 2 attributes
 *         a constructor method that accepts 2 params (type, price) and assign the right values to the object
 *         define a tester class with main() method where you:
 *         create 4 new SmartphonePrice objects: 2 for Producer and 2 for Retail
 *         create 2 new Smartphone objects, using the 4 newly created SmartphonePrice objects
 *         print in console all the details of the 2 newly created Smartphone objects
 *         check if the first smartphone is equal to the second smartphone, informing the user
 *         use a try{ ... } catch(Exception exception) { ... } to:
 *         get a new Smartphone object by cloning the second Smartphone
 *         print in console all the details of the newly cloned object
 *         check if the second smartphone is equal to the newly cloned object, informing the user
 *         inside the catch(Exception exception) { ... } scope:
 *         print the stack trace of the exception
 *         inform the user about the error
 */
public class Main {
    public static void main(String[] args) {
        SmartphonePrice bei = new SmartphonePrice("Producer ", 239);
        SmartphonePrice smartphonePrice = new SmartphonePrice("Retail", 348);

        SmartphonePrice bei2 = new SmartphonePrice("Producer ", 1339);
        SmartphonePrice smartphonePrice2 = new SmartphonePrice("Retail", 948);

        Smartphone samsung = new Smartphone("Samsung", "S10", 4000, bei, smartphonePrice);
        Smartphone iphone = new Smartphone("Apple", "Iphone 14P roMax", 4100, bei2, smartphonePrice2);

        System.out.println(samsung.toString());
        System.out.println(iphone.toString());

        if(samsung.equals(iphone)){
            System.out.println("First phone is equal to second phone");
        } else {
            System.out.println("First phone is not equal to second phone");
        }


        try{
            Smartphone newSmartphone = iphone.clone();
            System.out.println(newSmartphone.toString());

            if(iphone.equals(newSmartphone)){
                System.out.println("Cloned phone is equal to second phone");
            } else {
                System.out.println("Cloned phone is not equal to second phone");
            }

        } catch (Exception exception){
            exception.printStackTrace();
            System.out.println("There's an error. Error message: " + exception.getMessage());
        }

    }
}
