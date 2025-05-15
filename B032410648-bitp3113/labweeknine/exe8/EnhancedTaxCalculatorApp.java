package exe8;

/**
 * EnhancedTaxCalculatorApp is a class that demonstrates tax calculation for business owners.
 * It creates and manages a list of business owners, calculating and displaying their tax details.
 * @author Muhammad Afiq Muhaimin Bin Mohd Zaini, FTMK
 */

import java.util.ArrayList;
import java.util.List;

public class EnhancedTaxCalculatorApp {
    public static void main(String[] args) {
        // Create a list of BusinessOwner objects
        List<BusinessOwner> businessOwners = new ArrayList<>();

        // Adding business owners with their details (name, IC number, and income)
        businessOwners.add(new BusinessOwner("Fahrin bin Ahmad", "801010-01-6775", 889331.87));
        businessOwners.add(new BusinessOwner("Abdul Fattah bin Amin", "901214-15-6531", 1568344.23));


        // Loop over the list of business owners and calculate their tax details
        for (BusinessOwner owner : businessOwners) {
            owner.displayTaxDetails();  // Display tax details for each business owner
        }
    }
}











