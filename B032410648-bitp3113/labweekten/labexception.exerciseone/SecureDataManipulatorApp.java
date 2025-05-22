package labexception.exerciseone;


/**
 * BITP 3113 Object Oriented Programming
 * 
 * This class attempt to access a series of data.  A more robust and secure demo 
 * with try..catch block.
 * 
 * @author Emaliana Kasmuri, FTMK, UTeM
 */
public class SecureDataManipulatorApp {

	public static void main(String[] args) {
		
		// Sample of data
		int sampleData[] = {100, 101, 102, 103};
		
		System.out.println("Start of data access");
		for (int index = 0; index <= sampleData.length; index++) {
			
			try {
				
				System.out.println("\t" + sampleData[index]);
				
			} catch (Exception ex) {
				
				System.out.println("End of data access.  There are only " 
					+ sampleData.length + " data in the sample");
				break;
			}
		}

	}

}
