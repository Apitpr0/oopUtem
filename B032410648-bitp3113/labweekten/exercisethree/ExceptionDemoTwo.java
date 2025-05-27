package exercisethree;

/**
 * BITP 3113 Object Oriented Programming
 *
 * This class demonstrates exception handling for array index out of bounds scenarios.
 * It attempts to access data from a DataProducer object at different indices and
 * handles potential exceptions that may occur during execution.
 * The student needs to identify the type of exception produced from this class execution.
 *
 * @author Emaliana Kasmuri, FTMK, UTeM
 * @author Muhammad Afiq Muhaimin Bin Mohd Zaini, FTMK
 */
public class ExceptionDemoTwo {

	/**
	 * Main method that demonstrates exception handling with DataProducer.
	 * It attempts to access data at different indices and catches potential
	 * IndexOutOfBoundsException and other unexpected exceptions.
	 *
	 * @param args command line arguments (not used)
	 */
	public static void main(String[] args) {

		DataProducer producer = new DataProducer();

		try {
			// Get some data
			System.out.println("\t\n Data 1 is : " + producer.getData(0));
			System.out.println("\t\n Data 2 is : " + producer.getData(2));
			System.out.println("\t\n Last data is : " + producer.getData(6));
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Error: Tried to access data at invalid index - " + e.getMessage());
		} catch (Exception e) {
			System.out.println("An unexpected error occurred: " + e.getMessage());
		}

	}

}
