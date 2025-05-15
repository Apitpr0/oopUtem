package exe8;

/**
 * This class represents a business owner taxpayer who pays a fixed tax rate of 15%
 * on their income. It extends the TaxPayer class and provides specific implementation
 * for tax calculation and display of tax details.
 * 
 * @author Muhammad Afiq Muhaimin Bin Mohd Zaini, FTMK
 */
public class BusinessOwner extends TaxPayer {

    /**
     * Constructs a new BusinessOwner with specified details.
     *
     * @param name     The name of the business owner
     * @param icNumber The IC number of the business owner
     * @param income   The annual income of the business owner
     */
    public BusinessOwner(String name, String icNumber, double income) {
        super(name, icNumber, income);  // Call superclass constructor
    }

    /**
     * Calculates the tax amount for the business owner at a fixed rate of 15%.
     *
     * @return The calculated tax amount
     */
    @Override
    public double calculateTax() {
        return getIncome() * 0.15;  // 15% tax for business owners
    }

    /**
     * Displays the tax details for the business owner including name, IC number,
     * income, tax rate, and calculated tax amount.
     */
    @Override
    public void displayTaxDetails() {
        super.displayTaxDetails();  // Call the parent class method
        System.out.printf("Tax Rate: 15.00%%%n");  // Business owner tax rate
        System.out.printf("Tax Amount: RM %.2f%n", calculateTax());  // Display calculated tax
        System.out.println("--------------------------------------------------");
    }
}













