package labnine.hashmap;

import java.util.LinkedHashMap;
import java.util.Map;


/**
 * BITP 3113 Object Oriented Programming
 * 
 * This class demonstrate the use of Map to manipulate objects.
 * 
 * @author Emaliana Kasmuri, FTMK
 */
public class NetWorthHahsmapApp {

	public static void main(String[] args) {
		
		// Create object of 5 celebrities
		Celebrity andrew = 
				new Celebrity ("Andrew Lloyd Webber", 626, "million");
		Celebrity selena = new Celebrity ("Selena Gomez", 1.3, "billion");
		Celebrity george = new Celebrity ("George Lucas", 5.3, "billion");
		Celebrity oprah = new Celebrity ("Oprah Winfrey", 3, "billion");
		Celebrity kylie = new Celebrity ("Kylie Jenner", 710, "million");
		
		// Put into map
		// Key <String>: name
		Map<String, Celebrity> celebrityMap = 
				new LinkedHashMap<String, Celebrity>();
		celebrityMap.put("Andrew", andrew);
		celebrityMap.put("Selena", selena);
		celebrityMap.put("George", george);
		celebrityMap.put("Oprah", oprah);
		celebrityMap.put("Kylie", kylie);
		
		// Manipulates the map
		CelebrityManager celebrityManager = new CelebrityManager(celebrityMap);
		celebrityManager.findCelebrity("Selena");
		celebrityManager.findCelebrity("kylie");
		celebrityManager.findCelebrity("George Lucas");
		
	}

}
