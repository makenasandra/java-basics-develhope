package co.develhope.introduction;

/**
 * If/else Statement
 * Define a variable called myName and assign your name to it
 * Using the if-else statement, print if the number of letters in your name is even or odd
 */
public class IfElseStatement {
    public static void main(String[] args) {
        String myName = "Gingery";

        if (myName.length() % 2 == 0) {
            System.out.println("The number of letters in my name is even.");
        } else {
            System.out.println("The number of letters in my name is odd.");
        }
    }
}
