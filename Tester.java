/*create a class called Tester that has the main method where you:
create a new WordGames object
print in console the result of the addHelloWord method invocation
print in console the result of the getFullName method invocation
 */

/**
 * Tester class of WordGames class
 * Author : Maurizio
 */
public class Tester {
    public static void main(String[] args) {

        WordGames wordGames = new WordGames(); //creating a WordGames object

        String helloWord1 = wordGames.addHelloWord("hello"); //invocation of addHelloWord method
        System.out.println(helloWord1); //print of the helloWord1 string

        String fullName = wordGames.getFullName("Mario" , "Bros");  //invocation of fullname method

    }
}
