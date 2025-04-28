package exe.three;
/**
 * This is the code that will take the values that
 * we have calculated and then display it in a formatted way
 * @author Muhammad Afiq Muhaimin
 */

import java.text.NumberFormat;

public class MetricConversionApp {
    public static void main(String[] args) {
        // 1. Create an instance of MetricConverter to access the methods
        exe.three.MetricConverter converter = new exe.three.MetricConverter();

        // 2. Define imperial values (as per Table 2)
        int feet = 5094;
        int miles = 2503;
        int pounds = 104006;

        // 3. Convert to metric units using the methods
        double meters = converter.convertFtToMeter(feet);
        double kilometers = converter.convertMileToKm(miles);
        double kilograms = converter.convertPoundToKg(pounds);

        // 4. Format the results with commas for thousands and two decimal places
        NumberFormat numberFormatter = NumberFormat.getNumberInstance();

        String formattedMeters = numberFormatter.format(meters);
        String formattedKilometers = numberFormatter.format(kilometers);
        String formattedKilograms = numberFormatter.format(kilograms);

        // 5. Output the results in the desired format
        System.out.println("The Conversion Result:");
        System.out.println("--------------------------");
        System.out.printf("Feet to Meters: %s meters%n", formattedMeters);
        System.out.printf("Miles to Kilometers: %s kilometers%n", formattedKilometers);
        System.out.printf("Pounds to Kilograms: %s kilogram%n", formattedKilograms);
    }
}
