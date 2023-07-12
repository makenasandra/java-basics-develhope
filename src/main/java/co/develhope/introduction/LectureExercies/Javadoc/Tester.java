package co.develhope.introduction.LectureExercies.Javadoc;

/**
 * Exercise - Javadoc
 * have a quick look at the Java arithmetic operators
 * create a class called ArithmeticOperators that has 4 methods:
 * sum() method that takes 2 int parameters as input called num1 and num2 and returns their summation int
 * sub() method that takes 2 int parameters as input called num1 and num2 and returns their subtraction int
 * mul() method that takes 2 int parameters as input called num1 and num2 and returns their multiplication int
 * div() method that takes 2 int parameters as input called num1 and num2 and returns their division int
 * create a class called Tester that has the main method where you:
 * create a new ArithmeticOperators object
 * print in console the result of the 4 methods invocations, passing them (as params) int numbers as you like
 * add Javadoc comments to:
 * the 2 classes with a short description and the author
 * the 5 methods with a short description, the parameters and the return value
 * create a folder called GeneratedJavadoc under the main project folder
 * generate the Javadoc file using the IntelliJ Javadoc plugin right inside the newly created folder
 * explore the freshly generated Javadoc
 */
public class Tester {
    public static void main(String[] args) {
        ArithmeticOperators calc = new ArithmeticOperators();

        System.out.println(calc.div(125,5));
        System.out.println(calc.mul(12,8));
        System.out.println(calc.sum(400, 543));
        System.out.println(calc.sub(4000, 55));
    }
}
