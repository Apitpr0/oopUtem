import javax.print.DocFlavor.STRING;

/**
 * BITP 3113 Object Oriented Programming
 * 
 * This class display a text on the console
 * 
 * @author Emaliana Kasmuri, FTMK, UTeM
 */

public class TextDemoApp {
    
    /**
     * The main entry point to the application.
     * 
     * @param args
     */
    public static void main(String args[]) {
        
       // Text declaration
       String text = "Discover, monitor, and manage your Java environment with"
        + "this powerful new Oracle Cloud service";

       System.out.println("\nOrginal text: " + text);
       System.out.println("\nConverted text: " + text.toLowerCase());
        // Text declaration
        String secondText = "JDK Mission Control (JMC) is an advanced set of tools for"
                + "managing, monitoring, profiling, and troubleshooting Java applications.";

        System.out.println("\nOrginal text: " + secondText);
        System.out.println("\nConverted text: " + secondText.toLowerCase());
    }
}
