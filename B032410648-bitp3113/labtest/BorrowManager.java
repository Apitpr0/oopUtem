/**
 * BorrowManager.java
 * Manages the borrowing logic for FTMK Library.
 * Author: Muhammad Afiq Muhaimin
 * Matric Number: B032410648
 */

import java.util.ArrayList;
import java.util.List;

public class BorrowManager {
    private final List<Member> successfulBorrowers = new ArrayList<>();

    /**
     * Validates if a book is available for borrowing. If the book is available,
     * it marks the book as borrowed and updates the member's borrowed book.
     * If the book is not available, the member is informed that borrowing is unsuccessful.
     *
     * @param member The member attempting to borrow a book.
     * @param book The book the member wants to borrow.
     */
    public void validateBookBorrowable(Member member, Book book) {
        if (book.isAvailability()) {
            // Set the relationship between member and book
            member.setBorrowedBook(book);
            book.setAvailability(false);  // Update availability to false
            successfulBorrowers.add(member);

            // Inform the user that the borrow was successful
            System.out.println(member.getName() + " successfully borrowed \"" + book.getTitle() + "\".");
        } else {
            // Inform the user that the book is not available
            System.out.println(member.getName() + " failed to borrow \"" + book.getTitle() + "\" (Not available).");
        }
    }

    /**
     * Displays a list of all members who successfully borrowed a book.
     */
    public void displaySuccessfulBorrowers() {
        System.out.println("\nList of Members Who Successfully Borrowed a Book:");
        for (Member member : successfulBorrowers) {
            System.out.println(member.getName() + " borrowed \"" + member.getBorrowedBook().getTitle() + "\"");
        }
    }
}
