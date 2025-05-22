/**
 * This code shows the use of FileReader class and its exception handling.
 *
 * @author Muhammad Afiq Muhaimin Bin Mohd Zaini, FTMK
 */

import java.io.FileReader;
import java.io.FileNotFoundException;

public class FileReaderDemo {

    public static void main(String[] args) {

        try {
            // Creating a FileReader using the first constructor
            FileReader reader = new FileReader("bankaccounts.txt");

            System.out.println("FileReader object created successfully.");

        } catch (FileNotFoundException e) {
            // Handle the exception if the file is not found
            System.out.println("Exception caught: " + e);
        }
    }
}
