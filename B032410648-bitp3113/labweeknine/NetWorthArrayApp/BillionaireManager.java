package labweeknine.NetWorthArrayApp;

/**
 * BITP 3113 Object Oriented Programming
 * 
 * This class manages celebrities net worth information.
 * 
 * @author Emaliana Kasmuri, FTMK
 */

public class BillionaireManager {
	
	/**
	 * This method filter billionaires information.
	 * 
	 * @param celebrities - A list of celebrities
	 */
	public void filterBillionaire (Celebrity celebrities[]) {
		
		for (int index = 0; index < celebrities.length; index++) {
			
			// Get current celebrity
			Celebrity currentCelebrity = celebrities[index];
			
			// Skip on null celebrity
			if (currentCelebrity == null)
				continue;
			
			// Validate celebrity net ßworth status
			if (currentCelebrity.getUnit().equalsIgnoreCase("billion")) {
				
				System.out.print(currentCelebrity.getName() 
						+ " networth is USD ");
				System.out.println(currentCelebrity.getNetworth() + " billion.");
			}
		}
	}

}
