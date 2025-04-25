public class Book {
    private String title;
    private boolean availability;
    private int totalPages;
    private String isbn;  // Added ISBN field

    // Updated constructor to include ISBN
    public Book(String title, boolean availability, int totalPages, String isbn) {
        this.title = title;
        this.availability = availability;
        this.totalPages = totalPages;
        this.isbn = isbn;  // Initialize the ISBN
    }

    // Getter and Setter for ISBN
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Getter and Setter for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter for availability
    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    // Getter and Setter for totalPages
    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
}
