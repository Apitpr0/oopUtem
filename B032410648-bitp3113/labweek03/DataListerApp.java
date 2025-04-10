/**
 * BITP 3113 Object Oriented Programming
 * 
 * This class lists data in numbering format.
 * 
 * @author Emaliana Kasmuri, FTMK, UTeM
 */

public class DataListerApp {

    /**
     * The main entry point to the application.
     *
     * @param args
     */
    public static void main(String args[]) {

        // Data declaration
        String fruits[] = {"Watermelon", "Apple", "Orange", "Lemon", "Jackfruit", "Starfruit"};

        System.out.println("\nList of fruits");

        int number = 0;
        for (String fruit : fruits) {

            System.out.print(++number + ". ");
            System.out.println(fruit);


            System.out.println("\nProgram ends.\n");

        }

    }
}