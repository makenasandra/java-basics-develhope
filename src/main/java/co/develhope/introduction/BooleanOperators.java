package co.develhope.introduction;

/**
 * Boolean Operators
 * Try to solve on paper the following boolean algebra operations:
 *
 * [A]: 2 <= 2 && !true
 * [B]: !false && 3 > 2
 * [C]: considering that t=false and f=true: !(!t || f)
 * [D]: 6 > 6 ^ !(true && true)
 * Then compare your solutions with a Java program that tests the validity of your assumptions.
 */
public class BooleanOperators {
    public static void main(String[] args) {
        System.out.println("[A]:" + (2 <= 2 && !true));
        System.out.println("[B]:" + (!false && 3 > 2));

        boolean t=false;
        boolean f=true;
        System.out.println("[C]:" +  !(!t || f));
        System.out.println("[D]:" + (6 > 6 ^ !(true && true)));

    };
}
