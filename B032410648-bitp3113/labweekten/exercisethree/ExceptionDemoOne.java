
package exercisethree;

/**
 * BITP 3113 Object Oriented Programming
 *
 * This class demonstrates basic exception handling using try-catch blocks.
 * The student need to identify type of exception produced from this class.
 *
 * @author Emaliana Kasmuri, FTMK, UTeM
 * @author Muhammad Afiq Muhaimin Bin Mohd Zaini, FTMK
 */
public class ExceptionDemoOne {

	/**
	 * Main method to demonstrate basic exception handling
	 *
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		// Basic try-catch block to handle any potential exceptions
		try {
			System.out.println("Program running successfully.");
		} catch (Exception e) {
			System.out.println("An error occurred: " + e.getMessage());
		}
	}

}
