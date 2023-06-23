package co.develhope.introduction;

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
