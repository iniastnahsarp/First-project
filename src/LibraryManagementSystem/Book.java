package LibraryManagementSystem;

/**
 * Book class library ki ek book ko represent karti hai.
 *
 * Concepts Used:
 * 1. Class
 * 2. Encapsulation
 * 3. Constructor
 * 4. Getter/Setter
 * 5. toString()
 */

public class Book {

    // Private variables encapsulation ke liye
    private int id;
    private String title;
    private String author;
    private boolean issued;

    /**
     * Constructor
     * Jab object create hoga tab ye automatically call hoga.
     */
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.issued = false;
    }

    // Getter Methods

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return issued;
    }

    // Setter Method

    public void setIssued(boolean issued) {
        this.issued = issued;
    }

    /**
     * Object print karne par readable format milega.
     */
    @Override
    public String toString() {
        return "Book ID: " + id +
                "\nTitle: " + title +
                "\nAuthor: " + author +
                "\nIssued: " + issued;
    }
}
