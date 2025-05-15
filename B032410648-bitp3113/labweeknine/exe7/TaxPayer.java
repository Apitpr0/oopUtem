package exe7;
/**
 * This class represents a TaxPayer entity with basic personal and financial information.
 * It provides methods to manage taxpayer details and calculate taxes.
 *
 * @author Muhammad Afiq Muhaimin Bin Mohd Zaini, FTMK
 */



public class TaxPayer {
    /**
     * The full name of the taxpayer
     */
    private String name;

    /**
     * The identification card number of the taxpayer
     */
    private String icNumber;

    /**
     * The annual income of the taxpayer
     */
    private double income;

    /**
     * Constructs a new TaxPayer with specified details
     *
     * @param name     The taxpayer's full name
     * @param icNumber The taxpayer's IC number
     * @param income   The taxpayer's annual income
     */
    public TaxPayer(String name, String icNumber, double income) {
     this.name = name;
     this.icNumber = icNumber;
     this.income = income;
 }

    /**
     * @return The taxpayer's name
     */
    public String getName() {
        return name;
    }

    /**
     * @return The taxpayer's IC number
     */
    public String getIcNumber() {
        return icNumber;
    }

    /**
     * @return The taxpayer's income
     */
    public double getIncome() {
     return income;
 }

    /**
     * @param name The new name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param icNumber The new IC number to set
     */
    public void setIcNumber(String icNumber) {
        this.icNumber = icNumber;
    }

    /**
     * @param income The new income to set
     */
    public void setIncome(double income) {
     this.income = income;
 }

 // Concrete method calculateTax() in TaxPayer

    /**
     * Calculates the tax amount for the taxpayer
     *
     * @return The calculated tax amount (default implementation returns 0)
     */
    public double calculateTax() {
        return 0; // Default Implementation, ready for overriding
    }

    /**
     * Displays the taxpayer's details including name, IC number, and income
     */
    public void displayTaxDetails() {
     System.out.println("Name: " + getName());
     System.out.println("IC Number: " + getIcNumber());
     System.out.printf("Income: RM %.2f%n", getIncome());
 }
}











