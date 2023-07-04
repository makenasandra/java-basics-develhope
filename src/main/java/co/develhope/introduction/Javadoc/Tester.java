package co.develhope.introduction.Javadoc;

/**
 * The Tester class below creates a new WordGames object and prints out its methods
 */

public class Tester {
    public static void main(String[] args) {

        WordGames wordGames = new WordGames();

        System.out.println(wordGames.addHelloWord("Summer"));
        System.out.println(wordGames.getFullName("Jane", "Muna"));
    }
}
