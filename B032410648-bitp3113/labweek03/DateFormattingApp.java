import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 * BITP 3113 Object Oriented Programming
 * 
 * This class demonstrate date manipulation using Java LocalDateTime
 * 
 * @author Emaliana Kasmuri, FTMK, UTeM
 */
public class DateFormattingApp{
    /**
     * The main entry point to the application.
     * 
     * @param args
     */
    public static void main (String args[]) {
       // Get current date and time
       LocalDateTime currentDateTime = LocalDateTime.now();
       // Format date time according to understandable format
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
       // Format the LocalDateTime using the formatter
       String formattedDateTime = currentDateTime.format(formatter);
       // Print the formatted date and time
       System.out.println("\n\nCurrent Date and Time: " + formattedDateTime);
       // Get day as text
       DayOfWeek dayOfWeek = currentDateTime.getDayOfWeek();
       // Extract other details
       int year = currentDateTime.getYear();
       int month = currentDateTime.getMonthValue();
       int day = currentDateTime.getDayOfMonth();
       System.out.println("\nExtracted Details");
       System.out.println("Year: " + year);
       System.out.println("Month: " + month);
       System.out.println("Day: " + day);
       System.out.println("Day of week : " + dayOfWeek);
       // Manipulate date
       LocalDateTime yesterday = currentDateTime.minusDays(1);
       LocalDateTime twoWeeks = currentDateTime.plusDays(14);
       LocalDateTime threeHoursAgo = currentDateTime.minusHours(3);
       System.out.println("\nDate manipulation");
       System.out.println("Yesterday: " + yesterday.format(formatter));
       System.out.println("Two Week from now: " + twoWeeks.format(formatter));
       System.out.println("Three hours ago: " + threeHoursAgo.format(formatter));
       System.out.println("\nProgram ends\n");
    }
}
