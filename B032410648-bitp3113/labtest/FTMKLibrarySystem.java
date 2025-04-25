/**
 * FTMKLibrarySystem.java
 * Main class to simulate the library management prototype.
 * Author: Muhammad Afiq Muhaimin
 * Matric Number: B032410648
 */

import java.util.*;

public class FTMKLibrarySystem {
    public static void main(String[] args) {
        // 1. Create sample books with ISBN using List
        List<Book> books = new ArrayList<>();
        books.add(new Book("Silent Echoes", true, 352, "978-1234567890"));
        books.add(new Book("Crimson Rivers", true, 416, "978-0987654321"));
        books.add(new Book("Golden Shadows", false, 288, "978-5555555555"));
        books.add(new Book("Azure Secrets", true, 320, "978-1122334455"));

        // 2. Create members
        List<Member> members = new ArrayList<>();
        members.add(new Member("Ahmad Kamal"));
        members.add(new Member("Noraini Aziz"));
        members.add(new Member("Siti Fatimah"));

        // 3. Set memberId and borrowing target manually
        members.get(0).setMemberId(3456); // Ahmad Kamal wants "Azure Secrets"
        members.get(1).setMemberId(7442); // Noraini Aziz wants "Golden Shadows"
        members.get(2).setMemberId(3049); // Siti Fatimah wants "Silent Echoes"

        String[] requestedTitles = {
                "Azure Secrets",
                "Golden Shadows",
                "Silent Echoes"
        };

        BookManager bookManager = new BookManager();
        BorrowManager borrowManager = new BorrowManager();

        // === Feature 1: Display books before borrowing ===
        System.out.println("ISBN               Title                   Page#    Is Available?");
        System.out.println("---------------------------------------------------------------");
        for (Book book : books) {
            System.out.printf("%-20s %-25s %-8d %-15s\n",
                    book.getIsbn(), book.getTitle(), book.getTotalPages(), book.isAvailability() ? "true" : "false");
        }
        System.out.println("---------------------------------------------------------------");  // Separator after the top table

        // === Feature 2 & 3: Process borrow attempts ===
        System.out.println("\nProcessing book borrowing for Ahmad Kamal (3456)");
        borrowManager.validateBookBorrowable(members.get(0), books.get(3)); // Azure Secrets

        System.out.println("\nProcessing book borrowing for Noraini Aziz (7442)");
        borrowManager.validateBookBorrowable(members.get(1), books.get(2)); // Golden Shadows

        System.out.println("\nProcessing book borrowing for Siti Fatimah (3049)");
        borrowManager.validateBookBorrowable(members.get(2), books.get(0)); // Silent Echoes

        // === Feature 4: Display books after borrowing ===
        System.out.println("\nISBN               Title                   Page#    Is Available?");
        System.out.println("---------------------------------------------------------------");
        for (Book book : books) {
            System.out.printf("%-20s %-25s %-8d %-15s\n",
                    book.getIsbn(), book.getTitle(), book.getTotalPages(), book.isAvailability() ? "true" : "false");
        }
        System.out.println("---------------------------------------------------------------");  // Separator after the bottom table

        // Display members who successfully borrowed books
        System.out.println("\nMembers Successfully Borrowed a Book");
        System.out.println("---------------------------------------------------------------");
        for (Member member : members) {
            if (member.getBorrowedBook() != null) {
                System.out.println(member.getName() + " is going to read " +
                        member.getBorrowedBook().getTotalPages() + " pages of " +
                        member.getBorrowedBook().getIsbn());
            }
        }
        System.out.println("---------------------------------------------------------------");  // Separator after Members section

        // Add name and matric number at the end
        System.out.println("\nName: Muhammad Afiq Muhaimin Bin Mohd Zaini");
        System.out.println("Matric Number: B032410648");
    }
}
