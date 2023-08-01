/*Create a class called WordGames that has two methods:
addHelloWord method that takes one parameter as input called word and returns the String Hello [wordHere]
getFullName method that takes two parameters as input called name and surname and returns their concatenation
 */

/**
 * This class manipulate Words
 * Author : Maurizio
 */
public class WordGames {

    /**
     * This function takes a String parameter and return hello + the parameter
     * @param word
     * @return
     */
    public String addHelloWord(String word){
        return "hello " + word;
    }

    /**
     * This function takes name and surname and return their concatenation
     * @param name
     * @param surname
     * @return
     */
    public String getFullName(String name , String surname){

        return name + " " + surname;
    }
}
