package exe5;
/**
 * This is a class to represent each item for dior
 *
 * @author Muhammad Afiq Muhaimin Bin Mohd Zaini, FTMK
 */

// Declare variables for storage
public class DiorItem {
    private String DiorItemName;
    private double DiorItemPrice;
    private int DiorItemQuantity;

    //Constructor Generation
    public DiorItem(String diorItemName, double diorItemPrice, int diorItemQuantity) {
        DiorItemName = diorItemName;
        DiorItemPrice = diorItemPrice;
        DiorItemQuantity = diorItemQuantity;
    }

    //Getter
    public String getDiorItemName() {
        return DiorItemName;
    }

    public double getDiorItemPrice() {
        return DiorItemPrice;
    }

    //Method to calculate total sales
    public double calculateTotalSales() {
        return DiorItemPrice * DiorItemQuantity;
    }
}


