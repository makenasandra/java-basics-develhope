package co.develhope.introduction;

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
