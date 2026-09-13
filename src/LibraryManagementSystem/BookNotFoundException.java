package LibraryManagementSystem;

/**
 * Ye exception tab throw hogi
 * jab requested book library me na mile.
 */
public class BookNotFoundException extends Exception {

    public BookNotFoundException(String message) {
        super(message);
    }
}