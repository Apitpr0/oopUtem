package exe7;
/**
 * This class implements an enhanced tax calculator application that manages
 * tax calculations for salaried taxpayers. It demonstrates the use of inheritance
 * and polymorphism in handling different types of taxpayers and their tax calculations.
 *
 * @author Muhammad Afiq Muhaimin Bin Mohd Zaini, FTMK
 */

import java.util.ArrayList;
import java.util.List;

public class EnhancedTaxCalculatorApp {
    /**
     * The main entry point of the application.
     * Creates a list of salaried taxpayers with their details and calculates
     * their tax information including bonus and total taxable income.
     *
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        // Create a list of SalariedTaxPayer objects
        List<SalariedTaxPayer> taxpayers = new ArrayList<>();

        // Adding taxpayers with their details (name, IC number, income, tax rate, and bonus)
        taxpayers.add(new SalariedTaxPayer("Siti Nurhaliza binti Taruddin", "790178-07-6780", 10679568.67, 0.25, 1682676.67));
        taxpayers.add(new SalariedTaxPayer("Muhammad Najib bin Abdul Razak", "450819-03-4521", 568344.23, 0.21, 568344.23 * 0.10));  // 10% bonus
        taxpayers.add(new SalariedTaxPayer("Ananda Krishna", "890511-06-2387", 80231.11, 0.15, 80231.11 * 0.15));  // 15% bonus

      

        // Loop over the list of taxpayers and calculate their tax details
        for (SalariedTaxPayer taxpayer : taxpayers) {
            // Display Bonus and Total Taxable Income for each taxpayer
            taxpayer.displayTaxDetails();
        }
    }
}










