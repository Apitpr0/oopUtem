
package exe7;
/**
 * This class provides functionality to calculate and display tax details for salaried taxpayers.
 * It handles tax calculation operations and formatted display of taxpayer information.
 * 
 * @author Muhammad Afiq Muhaimin Bin Mohd Zaini, FTMK
 */
public class TaxCalculator {

    /**
     * Calculates the tax amount for a given salaried taxpayer.
     *
     * @param taxpayer The salaried taxpayer whose tax needs to be calculated
     * @return The calculated tax amount
     */
    public double calculateTaxAmount(SalariedTaxPayer taxpayer) {
        return taxpayer.calculateTax();  // Call calculateTax from SalariedTaxPayer
    }

    /**
     * Displays tax details for a salaried taxpayer including name, IC number,
     * annual income, tax rate, and calculated tax amount.
     *
     * @param taxpayer The salaried taxpayer whose details need to be displayed
     */
    public void displayTaxDetails(SalariedTaxPayer taxpayer) {
        System.out.println("Name: " + taxpayer.getName());
        System.out.println("IC Number: " + taxpayer.getIcNumber());
        System.out.printf("Annual Income: RM %,.2f%n", taxpayer.getIncome());
        System.out.printf("Tax Rate: %.2f%%%n", taxpayer.getRate() * 100); // No comma needed for percentage
        System.out.printf("Tax Amount: RM %,.2f%n", calculateTaxAmount(taxpayer));
        System.out.println("--------------------------------------------------");
    }

}





