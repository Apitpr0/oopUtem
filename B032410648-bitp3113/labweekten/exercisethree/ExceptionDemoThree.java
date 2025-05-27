package exercisethree;

import java.util.ArrayList;
import java.util.List;

/**
 * BITP 3113 Object Oriented Programming
 *
 * This class demonstrates exception handling with Department objects.
 * It creates departments, adds them to a list, and attempts to access their properties
 * while handling potential NullPointerException and other exceptions that may occur.
 * The student needs to identify the type of exception produced from this class.
 *
 * @author Emaliana Kasmuri, FTMK, UTeM
 * @author Muhammad Afiq Muhaimin Bin Mohd Zaini, FTMK
 */
public class ExceptionDemoThree {

	/**
	 * Main method that demonstrates exception handling with Department objects.
	 * Creates departments, adds them to a list, and displays staff count for each department
	 * while handling potential exceptions.
	 *
	 * @param args command line arguments (not used)
	 */
	public static void main(String[] args) {

		// Define departments;
		Department ftmk, bendahari;

		// Instantiate both departments
		ftmk = new Department("Fakulti Teknologi Maklumat dan Komunikasi");
		bendahari = new Department(14);
		bendahari.setName("Bendahari");

		// Add to list
		List<Department> departments = new ArrayList<Department>();
		departments.add(bendahari);
		departments.add(ftmk);

		// Display some details with exception handling
		for (Department department : departments) {
			try {
				String name = (department.getName() != null) ? department.getName() : "Unknown Department";
				List<?> staffList = department.getStaff();

				int staffCount = (staffList != null) ? staffList.size() : 0;

				System.out.println(name + " has " + staffCount + " staff.");

			} catch (NullPointerException e) {
				System.out.println("Error: Staff list is not initialized for department " + department.getName());
			} catch (Exception e) {
				System.out.println("An unexpected error occurred: " + e.getMessage());
			}
		}
	}

}
