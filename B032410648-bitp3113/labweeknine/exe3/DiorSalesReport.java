package exe3;

import java.util.ArrayList;

/**
 * Class to display all sales report for Christian Dior
 * Author: Muhammad Afiq Muhaimin Bin Mohd Zaini, FTMK
 */
public class DiorSalesReport {
    public static void main(String[] args) {

        // Create an ArrayList to store Dior items
        ArrayList<DiorItem> diorItems = new ArrayList<>();

        // Add items to the ArrayList
        diorItems.add(new DiorItem("Medium Lady Dior Bag - Black Cannage Lambskin", 31500.00, 56));
        diorItems.add(new DiorItem("Small Dior Book Tote - Blue Dior Oblique Embroidery and Calfskin", 17000.00, 43));
        diorItems.add(new DiorItem("Saddle Bag with Strap - Golden Saddle Grained Calfskin", 20500.00, 67));
        diorItems.add(new DiorItem("Small Dior Toujours Vertical Tote Bag - Gray Macrocannage Calfskin", 15500.00, 15));
        diorItems.add(new DiorItem("30 Montaigne East-West Bag with Chain - Black Calfskin", 15500.00, 26));

        //Add additonal Sales Data
        diorItems.add(new DiorItem("Medium Dior Book Tote - Multicolor Dior" +
                "Pivoine Embroidery ",16000.00,24 ));
        diorItems.add(new DiorItem("Small Lady Dior My ABCDior Bag - Blush" +
                "Pink Cannage Lambskin ",29500.00,8 ));
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
