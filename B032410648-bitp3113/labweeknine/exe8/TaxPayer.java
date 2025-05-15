package exe8;
/**
 * @author Muhammad Afiq Muhaimin Bin Mohd Zaini, FTMK
 */


public class TaxPayer {
 private String name;
 private String icNumber;
 private double income;

 public TaxPayer(String name, String icNumber, double income) {
     this.name = name;
     this.icNumber = icNumber;
     this.income = income;
 }

 public String getName() {
     return name;
 }

 public String getIcNumber() {
     return icNumber;
 }

 public double getIncome() {
     return income;
 }

 public void setName(String name) {
     this.name = name;
 }

 public void setIcNumber(String icNumber) {
     this.icNumber = icNumber;
 }

 public void setIncome(double income) {
     this.income = income;
 }

 // Concrete method calculateTax() in TaxPayer
 public double calculateTax() {
     return 0; // Default implementation for TaxPayer, can be overridden
 }

 public void displayTaxDetails() {
     System.out.println("Name: " + getName());
     System.out.println("IC Number: " + getIcNumber());
     System.out.printf("Income: RM %.2f%n", getIncome());
 }
}











