package exe5;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Program to store Dior Table 2 product sales data using LinkedHashMap,
 * display keys, item details, total sales, and search for a specific item.
 *
 * Author: Muhammad Afiq Muhaimin Bin Mohd Zaini, FTMK
 */
public class DiorSalesMapTable2 {
    public static void main(String[] args) {

        // Create LinkedHashMap to store Dior items (Table 2) using short keys
        Map<String, DiorItem> diorMap = new LinkedHashMap<>();

        // Add Table 2 items
        diorMap.put("Medium Dior Book Tote", new DiorItem(
                "Medium Dior Book Tote - Multicolor Dior Pivoine Embroidery", 16000.00, 24));

        diorMap.put("Small Lady Dior My ABCDior Bag", new DiorItem(
                "Small Lady Dior My ABCDior Bag - Blush Pink Cannage Lambskin", 29500.00, 8));

        // Display all keys
        System.out.println("Keys used in the Dior Map (Item Short Names):");
        Set<String> keys = diorMap.keySet();
        for (String key : keys) {
            System.out.println("- " + key);
        }

        // Display sales report
        System.out.println("\nChristian Dior Malaysia - Sales Report (Table 2)");
        System.out.printf("%-75s %-15s %-20s%n", "Item Name", "Price (RM)", "Total Sales (RM)");
        System.out.println("-----------------------------------------------------------------------------------------------------");

        double totalSales = 0.0;

        for (String key : keys) {
            DiorItem item = diorMap.get(key);
            double itemTotal = item.calculateTotalSales();
            totalSales += itemTotal;

            System.out.printf("%-75s RM %10.2f RM %18.2f%n",
                    item.getDiorItemName(),
                    item.getDiorItemPrice(),
                    itemTotal);
        }

        // Display total sales
        System.out.printf("\nTotal sales for all items: RM %,.2f%n", totalSales);

        // Hardcoded search key
        String searchKey = "Small Lady Dior My ABCDior Bag";
        System.out.println("\nSearching for key: \"" + searchKey + "\"");

        System.out.println("\nSearch Result:");
        if (diorMap.containsKey(searchKey)) {
            DiorItem foundItem = diorMap.get(searchKey);
            System.out.println("Item found!");
            System.out.printf("Full Name     : %s%n", foundItem.getDiorItemName());
            System.out.printf("Price (RM)    : RM %,.2f%n", foundItem.getDiorItemPrice());
            System.out.printf("Total Sales   : RM %,.2f%n", foundItem.calculateTotalSales());
        } else {
            System.out.printf("Item with key \"%s\" not found.%n", searchKey);
        }
    }
}
