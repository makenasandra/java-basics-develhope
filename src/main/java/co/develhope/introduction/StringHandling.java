package co.develhope.introduction;

public class StringHandling {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "How are you?";
        String charArray = string1.substring(0, 2) +string2.substring(string2.length()-2, string2.length());
        System.out.println("Final String: " + charArray);

    }
}
