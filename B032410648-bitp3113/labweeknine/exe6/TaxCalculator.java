package exe6;
/**
 * This class is used as the template for the output
 * @author Muhammad Afiq Muhaimin Bin Mohd Zaini, FTMK
 */
public class TaxCalculator {

    // Return the tax amount
    public double calculateTaxAmount(SalariedTaxPayer taxpayer) {
        return taxpayer.calculateTax();
    }

    // Display all output related to the person
    public void displayTaxDetails(SalariedTaxPayer taxpayer) {
        System.out.println("Name: " + taxpayer.getName());
        System.out.println("IC Number: " + taxpayer.getIcNumber());
        System.out.printf("Annual Income: RM %,.2f%n", taxpayer.getIncome()); // <-- comma added
        System.out.printf("Tax Rate: %.2f%%%n", taxpayer.getRate() * 100);
        System.out.printf("Tax Amount: RM %,.2f%n", calculateTaxAmount(taxpayer)); // <-- comma added
        System.out.println("--------------------------------------------------");
    }

}

