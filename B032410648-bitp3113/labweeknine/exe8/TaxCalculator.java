package exe8;

import exe7.SalariedTaxPayer;

/**
 * This class handles tax calculations and display of tax details for salaried taxpayers.
 * It provides methods to calculate tax amounts and display formatted tax information
 * for individual taxpayers.
 * 
 * @author Muhammad Afiq Muhaimin Bin Mohd Zaini, FTMK
 */
public class TaxCalculator {

    /**
     * Calculates the tax amount for a given salaried taxpayer.
     *
     * @param taxpayer The salaried taxpayer for whom to calculate tax
     * @return The calculated tax amount
     */
    public double calculateTaxAmount(SalariedTaxPayer taxpayer) {
        return taxpayer.calculateTax();  // Call calculateTax from SalariedTaxPayer
    }

    /**
     * Displays formatted tax details for a salaried taxpayer including their name,
     * IC number, annual income, tax rate, and calculated tax amount.
     *
     * @param taxpayer The salaried taxpayer whose details to display
     */
    public void displayTaxDetails(SalariedTaxPayer taxpayer) {
        System.out.println("Name: " + taxpayer.getName());
        System.out.println("IC Number: " + taxpayer.getIcNumber());
        System.out.printf("Annual Income: RM %.2f%n", taxpayer.getIncome());
        System.out.printf("Tax Rate: %.2f%%%n", taxpayer.getRate() * 100); // Access getRate() from SalariedTaxPayer
        System.out.printf("Tax Amount: RM %.2f%n", calculateTaxAmount(taxpayer));
        System.out.println("--------------------------------------------------");
    }
}





