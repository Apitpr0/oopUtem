package labweeknine.NetWorthArrayApp;

/**
 * BITP 3113 Object Oriented Programming
 * 
 * This class mapulates a list of objects using conventional array, []
 * 
 * @author Emaliana Kasmuri, FTMK
 */
public class NetWorthArrayApp {

	public static void main(String[] args) {
		
		// Define celebrity data
		String names[] = {"George Lucas", "Oprah Winfrey", "Kylie Jenner"};
		double networths[] = {5.3, 3, 710};
		String units[] = {"billion", "billion", "million"};
		
		// Create celebrity object
		Celebrity selena = new Celebrity ("Selena Gomez", 1.3, "billion");
		
		
		// Store 5 celebrities in an array
		Celebrity[] celebrities = new Celebrity[5];
		
		// Add celebrities into array
		celebrities[0] = new Celebrity ("Andrew Lloyd Webber", 626, "million");
		celebrities[1] = selena;
		
		// Display only billionaire
		BillionaireManager billionaireManager = new BillionaireManager();
		
		// Add more celebrities
		for (int index = 0; index < names.length; index++) {
			
			// Create object
			Celebrity celebrity = new Celebrity(names[index], networths[index],
					units[index]);
			
			// Add to array
			celebrities[index+2] = celebrity;
			
		}
		
		// Display only billionaire
		billionaireManager.filterBillionaire(celebrities);
	}

}
