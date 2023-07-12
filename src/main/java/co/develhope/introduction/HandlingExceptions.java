package co.develhope.introduction;

/**
 * Exercise: Exceptions Handling
 * Define a method checkScore that takes a double score as input parameter
 *
 * if 0 < score <= 50.00 then print Average score
 *
 * if 50.00 < score <= 100.00 the print Very good score
 *
 * in all other cases throw an ArithmeticException with the message Score is out of scale!
 *
 * test the method with the following values:
 *
 * 2.15
 * 50
 * 95.02
 * 100.01
 */
public class HandlingExceptions {
    public static void main(String[] args) {

        checkScore(2.15);
        checkScore(50.);
        checkScore(95.02);
        checkScore(100.01);
    }

    private static void  checkScore(Double score) throws ArithmeticException{
        if(score <= 50.0){
            System.out.println("Average score");
        } else if (score <= 100) {
            System.out.println("Very good score");
        } else {
            throw new ArithmeticException("Score is out of scale!");
        }
    }
}
