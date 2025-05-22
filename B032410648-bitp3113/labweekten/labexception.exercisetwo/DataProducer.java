package labexception.exetwo;

import java.util.Arrays;
import java.util.List;

/**
 * BITP 3113 Object Oriented Programming
 * 
 * This class produces data.
 * 
 * @author Emaliana Kasmuri, FTMK, UTeM
 */

public class DataProducer {
	
	// Sample of data
	private String names[] = {"Ismail", "Ahmad", "Jyotika", "Wong Fey Hong"};
	
	
	/**
	 * This method returns data from a specific location
	 * @param index
	 * @return data
	 */
	public String getData(int index) {
		
		return names[index];
	}
	
	/**
	 * This class returns the whole sample set of data.
	 * 
	 * @return whole sample set
	 */
	public List<String> getData() {
		
		return Arrays.asList(names);
	}
}
