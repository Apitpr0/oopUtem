package exe7;

/**
 * This class represents a salaried taxpayer who receives regular income and bonus.
 * It extends the TaxPayer class to include specific tax calculations for salaried employees.
 * The tax is calculated based on the total taxable income (regular income + bonus) multiplied by the tax rate.
 * 
 * @author Muhammad Afiq Muhaimin Bin Mohd Zaini, FTMK
 */
public class SalariedTaxPayer extends TaxPayer {
    /**
     * The tax rate applied to the taxpayer's total taxable income.
     * Stored as a decimal value (e.g., 0.15 for 15%)
     */
    private double rate;

    /**
     * The bonus amount received by the taxpayer.
     * This is added to the regular income for tax calculation purposes.
     */
    private double bonus;

    // Constructor with an additional bonus parameter

    /**
     * Constructs a new SalariedTaxPayer with the specified details.
     *
     * @param name     The taxpayer's full name
     * @param icNumber The taxpayer's IC number
     * @param income   The taxpayer's regular income
     * @param rate     The tax rate to be applied (as decimal)
     * @param bonus    The bonus amount received
     */
    public SalariedTaxPayer(String name, String icNumber, double income, double rate, double bonus) {
        super(name, icNumber, income);  // Call superclass constructor
        this.rate = rate;
        this.bonus = bonus;
    }

    /**
     * Gets the tax rate applied to this taxpayer.
     *
     * @return The tax rate as a decimal value
     */
    public double getRate() {
        return rate;
    }

    /**
     * Sets the tax rate for this taxpayer.
     *
     * @param rate The new tax rate as a decimal value
     */
    public void setRate(double rate) {
        this.rate = rate;
    }

    /**
     * Gets the bonus amount received by this taxpayer.
     *
     * @return The bonus amount
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * Sets the bonus amount for this taxpayer.
     *
     * @param bonus The new bonus amount
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Overriding the calculateTax method to include bonus in the tax calculation

    /**
     * Calculates the tax amount for this salaried taxpayer.
     * The calculation includes both regular income and bonus, multiplied by the tax rate.
     *
     * @return The calculated tax amount
     */
    @Override
    public double calculateTax() {
        double totalTaxableIncome = getIncome() + bonus; // Add bonus to income for tax calculation
        return totalTaxableIncome * rate;
    }

    /**
     * Displays detailed tax information for this salaried taxpayer.
     * Includes basic information from TaxPayer class plus bonus, total taxable income,
     * tax rate, and calculated tax amount.
     */
    // Overriding displayTaxDetails to include bonus and updated tax
    @Override
    public void displayTaxDetails() {
        System.out.println("Taxpayer Information for each individual:");
        super.displayTaxDetails();  // Display basic info from TaxPayer
        System.out.printf("Bonus: RM %.2f%n", bonus);  // Display Bonus
        System.out.printf("Total Taxable Income: RM %.2f%n", getIncome() + bonus);  // Display Total Taxable Income
        System.out.printf("Tax Rate: %.2f%%%n", rate * 100);  // Display the tax rate as percentage
        System.out.printf("Tax Amount: RM %.2f%n", calculateTax());  // Display the calculated tax amount
        System.out.println("--------------------------------------------------");
    }
}
















