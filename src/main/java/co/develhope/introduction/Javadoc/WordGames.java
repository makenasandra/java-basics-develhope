package co.develhope.introduction.Javadoc;

/**
 * The class below contains two methods
 * 1. addHelloWord method
 * 2. getFullName method
 *
 * @Author: MK
 */
public class WordGames {

    /**
     * addHelloWord method that takes one parameter as input called word and returns the String Hello [wordHere]
     * @param word
     * @return Hello [word]
     */
    public String addHelloWord(String word){
        return "Hello " + word;
    }

    /**
     *  getFullName method that takes two parameters as input called name and surname and returns their concatenation
     * @param name
     * @param surname
     * @return name + surname
     */
    public String getFullName(String name, String surname){
        return name + " " + surname;

    }
}
