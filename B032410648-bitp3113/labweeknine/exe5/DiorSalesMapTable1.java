package exe5;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Program to store Dior product sales data using LinkedHashMap,
 * display keys, sales for each item, total sales, and search by a fixed key.
 *
 * @author Muhammad Afiq Muhaimin Bin Mohd Zaini, FTMK
 */
public class DiorSalesMapTable1 {
    public static void main(String[] args) {

        // Create LinkedHashMap to store Dior items with short keys
        Map<String, DiorItem> diorMap = new LinkedHashMap<>();

        // Add Table 1 items
        diorMap.put("Medium Lady Dior Bag", new DiorItem(
                "Medium Lady Dior Bag - Black Cannage Lambskin", 31500.00, 56));

        diorMap.put("Small Dior Book Tote", new DiorItem(
                "Small Dior Book Tote - Blue Dior Oblique Embroidery and Calfskin", 17000.00, 43));

        diorMap.put("Saddle Bag with Strap", new DiorItem(
                "Saddle Bag with Strap - Golden Saddle Grained Calfskin", 20500.00, 67));

        diorMap.put("Small Dior Toujours Vertical Tote", new DiorItem(
                "Small Dior Toujours Vertical Tote Bag - Gray Macrocannage Calfskin", 15500.00, 15));

        diorMap.put("30 Montaigne East-West Bag", new DiorItem(
                "30 Montaigne East-West Bag with Chain - Black Calfskin", 15500.00, 26));

        // Display all keys (short names)
        System.out.println("Keys used in the Dior Map (Item Short Names):");
        Set<String> keys = diorMap.keySet();
        for (String key : keys) {
            System.out.println("- " + key);
        }

        // Display full report
        System.out.println("\nChristian Dior Malaysia - Sales Report (Table 1)");
        System.out.printf("%-65s %-20s%n", "Item Name", "Total Sales (RM)");
        System.out.println("----------------------------------------------------------------------------");

        double grandTotal = 0.0;

        for (String key : keys) {
            DiorItem item = diorMap.get(key);
            double itemSales = item.calculateTotalSales();
            grandTotal += itemSales;

            System.out.printf("%-65s RM %,18.2f%n",
                    item.getDiorItemName(),
                    itemSales);
        }

        // Display total sales
        System.out.printf("\nTotal sales for all items: RM %,.2f%n", grandTotal);

        // Hardcoded search key
        String searchKey = "Saddle Bag with Strap";
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
