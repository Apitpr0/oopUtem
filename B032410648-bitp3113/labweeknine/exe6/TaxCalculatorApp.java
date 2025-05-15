package exe6;
/**
 * Main class for the program
 *
 * @author Muhammad Afiq Muhaimin Bin Mohd Zaini, FTMK
 */

public class TaxCalculatorApp {
    public static void main(String[] args) {
        // Create SalariedTaxPayer objects for the three individuals
        SalariedTaxPayer tp1 = new SalariedTaxPayer("Siti Nurhaliza binti Taruddin", "790178-07-6780", 10679568.67, 0.25);
        SalariedTaxPayer tp2 = new SalariedTaxPayer("Muhammad Najib bin Abdul Razak", "450819-03-4521", 568344.23, 0.21);
        SalariedTaxPayer tp3 = new SalariedTaxPayer("Ananda Krishna", "890511-06-2387", 80231.11, 0.15);

        // Create the TaxCalculator instance
        TaxCalculator calculator = new TaxCalculator();

        // Display tax details for each individual
        System.out.println("Tax Calculation for Each Individual:\n");
        calculator.displayTaxDetails(tp1);
        calculator.displayTaxDetails(tp2);
        calculator.displayTaxDetails(tp3);
    }
}