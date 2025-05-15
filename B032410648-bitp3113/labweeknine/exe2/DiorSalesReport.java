package exe2;

/**
 * Class to display all sales report for Christian Dior
 * Author: Muhammad Afiq Muhaimin Bin Mohd Zaini, FTMK
 */
public class DiorSalesReport {
    public static void main(String[] args) {

        // Create array to store items
        DiorItem[] diorItems = {
                new DiorItem("Medium Lady Dior Bag - Black Cannage Lambskin", 31500.00, 56),
                new DiorItem("Small Dior Book Tote - Blue Dior Oblique Embroidery and Calfskin", 17000.00, 43),
                new DiorItem("Saddle Bag with Strap - Golden Saddle Grained Calfskin", 20500.00, 67),
                new DiorItem("Small Dior Toujours Vertical Tote Bag - Gray Macrocannage Calfskin", 15500.00, 15),
                new DiorItem("30 Montaigne East-West Bag with Chain - Black Calfskin", 15500.00, 26)
        };

        // Print the header
        System.out.println("Sales report for Christian Dior Malaysia\n");

        System.out.printf("%-70s %-15s %-20s%n", "Item Name", "Price (RM)", "Total Sales (RM)");
        System.out.println("-----------------------------------------------------------------------------------------------------------");

        // Display individual item details
        for (DiorItem diorItem : diorItems) {
            double totalSales = diorItem.calculateTotalSales();
            String formattedPrice = String.format("RM %,.2f", diorItem.getDiorItemPricePerUnit());
            String formattedTotal = String.format("RM %,.2f", totalSales);

            System.out.printf("%-70s %15s %20s%n",
                    diorItem.getDiorItemName(),
                    formattedPrice,
                    formattedTotal);
        }

        // Display total sales for all items
        double totalSales = new DiorSalesCalc().calculateTotalSales(diorItems);
        System.out.printf("\nTotal sales for all items: RM %,.2f%n", totalSales);
    }
}
