package labexception.exerciseone;

import java.io.FileReader;

/**
 * BITP 3113 Object Oriented Programming
 * 
 * This class attempt to access a series of data.  A demo without try..catch 
 * block.
 * 
 * @author Emaliana Kasmuri, FTMK, UTeM
 */
public class DataManipulatorApp {

	public static void main(String[] args) {
		
		// Sample of data
		int sampleData[] = {100, 101, 102, 103};
		
		System.out.println("Start of data access");
		for (int index = 0; index <= sampleData.length; index++) {
			
			System.out.println("\t" + sampleData[index]);
		}
		System.out.println("End of data access");

	}

}
