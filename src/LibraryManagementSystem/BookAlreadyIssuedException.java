package LibraryManagementSystem;

/**
 * Agar book pehle se issue hai
 * to ye exception throw hogi.
 */
public class BookAlreadyIssuedException extends Exception {

    public BookAlreadyIssuedException(String message) {
        super(message);
    }
}