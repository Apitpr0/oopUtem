/**
 * BookManager.java
 * Handles display and formatting of book data in the FTMK Library.
 * Author: Muhammad Afiq Muhaimin
 * Matric Number: B032410648
 */

import java.util.List;

public class BookManager {

    /**
     * Prints the header row for displaying book information.
     * This method defines the column names and their alignment.
     */
    public void printHeader() {
        // Format and print the column headers with the requested titles
        System.out.printf("%-20s %-25s %-10s %-15s\n", "ISBN", "Title", "Page#", "Is Available");
    }

    /**
     * Prints the details of a single book.
     * This method formats the book's information into a readable table row.
     *
     * @param book The book object containing the data to be printed.
     */
    public void printBookDetailsInline(Book book) {
        // Print the book details in the new format: ISBN, Title, Page#, Is Available (true/false)
        System.out.printf("%-20s %-25s %-10d %-15b\n",
                book.getIsbn(),                    // ISBN of the book
                book.getTitle(),                   // Title of the book
                book.getTotalPages(),              // Number of pages in the book
                book.isAvailability());            // Availability status (true/false)
    }

    /**
     * Prints the details of all books in the provided list.
     * This method first prints the header, then iterates over the list of books
     * and prints their details using the printBookDetailsInline method.
     *
     * @param books A list of books to be printed.
     */
    public void printAllBooks(List<Book> books) {
        // First, print the header
        printHeader();

        // Iterate over each book in the list and print its details
        for (Book book : books) {
            printBookDetailsInline(book);  // Print details for each book
        }
    }
}
