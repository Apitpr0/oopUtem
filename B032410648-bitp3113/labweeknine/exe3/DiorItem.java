package exe3;
/**
 * This is a class to represent each item for dior
 *
 * @author Muhammad Afiq Muhaimin Bin Mohd Zaini, FTMK
 */

public class DiorItem {
    //Declare all attributes
    private String DiorItemName;
    private double DiorItemPricePerUnit;
    private int DiorItemQuantitySold;

    //Declare Constructor
    public DiorItem(String diorItemName, double diorItemPricePerUnit, int diorItemQuantitySold) {
        DiorItemName = diorItemName;
        DiorItemPricePerUnit = diorItemPricePerUnit;
        DiorItemQuantitySold = diorItemQuantitySold;
    }

    //Set Getters
    public String getDiorItemName() {
        return DiorItemName;
    }

    public double getDiorItemPricePerUnit() {
        return DiorItemPricePerUnit;
    }

    public int getDiorItemQuantitySold() {
        return DiorItemQuantitySold;
    }

    //Method to calculate total sales for all items
    public double calculateTotalSales() {
        return DiorItemPricePerUnit * DiorItemQuantitySold;
    }
}