import java.util.Arrays;

/**
 * BITP 3113 Object Oriented Programming
 * 
 * This class calculate average for a set of numbers
 * 
 * @author Emaliana Kasmuri, FTMK, UTeM
 */

public class AverageCalculator {

    /**
     * The main entry point to the application.
     * 
     * @param args
     */
    public static void main (String args[])

    {


        // Define data in arrays 
        int data[] = {24, 46, 67};

        // Calculate total    
        int total = 0;
        for (int number : data) {
            total += number;


            // Calculate average
            int average = total / data.length;
            System.out.println("\nAverage calculator");
            System.out.println("Data to process: " + Arrays.toString(data));
            System.out.println("Average : " + average);

            System.out.println("\nProcess ends.\n");


        }
    }
}