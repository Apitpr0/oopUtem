package exe6;
/**
 *  Class is used to check the rate for each taxpayer according to the tier
 *
 * @author Muhammad Afiq Muhaimin Bin Mohd Zaini
 */

// Declare variable and inherit from TaxPayer as a superclass
public class SalariedTaxPayer extends TaxPayer {
    private double rate;

    //Pass constructor
    public SalariedTaxPayer(String name, String icNumber, double income, double rate) {
        super(name, icNumber, income);
        this.rate = rate;
    }

    //Getter
    public double getRate() {
        return rate;
    }

    //Setter
    public void setRate(double rate) {
        this.rate = rate;
    }

    //Method to calculate their tax with the specified rate
    public double calculateTax() {
        return getIncome() * rate;
    }
}