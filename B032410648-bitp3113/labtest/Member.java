/**
 * This class represents a member of the FTMK Library
 * who attempts to borrow a hard-bound book.
 * Author: Muhammad Afiq Muhaimin
 * Matric Number: B032410648
 */

public class Member {
    private int memberId;
    private String name;
    private Book borrowedBook;

    // Constructor that takes only name
    public Member(String name) {
        this.name = name;
        this.borrowedBook = null;  // Initially, no book is borrowed
    }

    // Getter and Setter for memberId
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getMemberId() {
        return memberId;
    }

    // Getter and Setter for name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Getter and Setter for borrowedBook
    public void setBorrowedBook(Book borrowedBook) {
        this.borrowedBook = borrowedBook;
    }

    public Book getBorrowedBook() {
        return borrowedBook;
    }
}
