package co.develhope.introduction;

public class NumberTest {
    public static void main(String[] args) {
        int a = 15;
        a +=5;
        a -=4;
        int b = a;
        b++;

//        System.out.println(b);

        boolean bIsOdd = false;
        if (b%2 != 0){
            bIsOdd = true;
        }
        System.out.println("Value b is odd: " + bIsOdd);



        boolean isbDIvisbleBy3 = false;
        if((b * b+1)%3 == 0){
            isbDIvisbleBy3 = true;
        }

        System.out.println("Value b is divisible by 3: " + isbDIvisbleBy3);
    }

}
