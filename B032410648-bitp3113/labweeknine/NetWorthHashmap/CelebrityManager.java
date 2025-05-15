package labnine.hashmap;

import java.util.Map;

/**
 * BITP 3113 Object Oriented Programming
 * 
 * This class manage the celebrity information
 * 
 * @author Emaliana Kasmuri, FTMK
 */ 
public class CelebrityManager {
	
	private Map<String, Celebrity> celebrityMap;
	
	
	/**
	 * Initalize class data
	 * 
	 * @param celebrityMap
	 */
	public CelebrityManager(Map<String, Celebrity>  celebrityMap) {
		
		this.celebrityMap = celebrityMap;
	}
	
	
	/**
	 * This method finds and display a celebrity based on the specified key.
	 * 
	 * @param key: celebrity first name
	 */
	public void findCelebrity (String key) {
		
		// Get a celebrity using key
		Celebrity celebrity = celebrityMap.get(key);
		
		// Validate and display celebrity
		if (celebrity != null) {
		
			System.out.print(celebrity.getName() + " networth is USD ");
			System.out.println(celebrity.getNetworth() + " billion.");
		
		} else {
			
			System.out.println("'" + key  + "'"  
					+ " is not exist in the current hashmap.");
		}
		
			
			
		
	}

}
