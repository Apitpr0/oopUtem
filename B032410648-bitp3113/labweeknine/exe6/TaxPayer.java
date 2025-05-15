package exe6;
/**
 * This class is used to retrieve the information related to the taxpayer
 *
 * @author Muhammad Afiq Muhaimin Bin Mohd Zaini, FTMK
 */

//Declare Variables to store
public class TaxPayer {
    private String name;
    private String icNumber;
    private double income;

    //Declare Constructor
    public TaxPayer(String name, String icNumber, double income) {
        this.name = name;
        this.icNumber = icNumber;
        this.income = income;
    }

    //Declare Getter
    public String getName() {
        return name;
    }

    public String getIcNumber() {
        return icNumber;
    }

    public double getIncome() {
        return income;
    }

    //Declare Setter and passing name, ic number and income
    public void setName(String name) {
        this.name = name;
    }

    public void setIcNumber(String icNumber) {
        this.icNumber = icNumber;
    }

    public void setIncome(double income) {
        this.income = income;
    }
}