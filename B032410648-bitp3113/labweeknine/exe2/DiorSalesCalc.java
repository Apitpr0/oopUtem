package exe2;

/**
 * Class to calculate total sales for each item
 *
 * @author Muhammad Afiq Muhaimin Bin Mohd Zaini, FTMK
 */
public class DiorSalesCalc {

    //Method to calculate total sales for all items
    public double calculateTotalSales(DiorItem[] diorItems) {
        double totalSales = 0;

        for (DiorItem item : diorItems) {
            totalSales += item.calculateTotalSales();
        }

        return totalSales;
    }
}
