package co.develhope.introduction;

/**
 * Arrays
 * -Define a testing class with a main() method where you: -Define an array of strings called carBrands that is populated with 5 famous car brand names
 *
 * Print in console the number of items of the carBrands array
 * Print in console the 3rd item of carBrands array -Declare an empty array of integers called primeNumbers with a predefined size of 6 items
 * Iinsert one by one the values of the first 6 prime numbers, populating primeNumbers array -Print in console all the content of the already populated primeNumbers array
 */
public class Arrays {
    public static void main(String[] args) {
       String[] carBrands = {"ferari", "nissan", "mazda", "audi", "rolls royce"};

       System.out.println("3rd Item: " + carBrands[2]);

       int[] primeNumbers = new int[6];

        // initialize first element
        primeNumbers[0] = 2;
        // initialize second element
        primeNumbers[1] = 3;
        // and so forth
        primeNumbers[2] = 5;
        primeNumbers[3] = 7;
        primeNumbers[4] = 11;
        primeNumbers[5] = 13;

        System.out.println("First 6 Prime Numbers:" + java.util.Arrays.toString(primeNumbers));

    }

}
