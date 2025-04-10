
/**
 * BITP 3113 Object Oriented Programming
 * 
 * This class demonstrate text manipulation process.
 * 
 * @author Emaliana Kasmuri, FTMK, UTeM
 */

public class StringManipApp {

     /**
     * The main entry point to the application.
     * 
     * @param args
     */
    public static void main (String args[]) {

        String text = "Java is used to develop mobile apps, web apps, " 
            + "desktop apps, games and much more.";

        System.out.println("\nProcessing text: " + text);

        // Get text length
        int length = text.length();
        System.out.println("\nLength: " + length + " characters");

        // Count number of words
        int totalWords = text.split("\\s").length;
        System.out.println("Total words: " + totalWords);

        // Convert to upper case
        String textUpperCase = text.toUpperCase();
        System.out.println("In Upper case: " + textUpperCase);

        System.out.println("\nProcessing ends\n");

    }
}