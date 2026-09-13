package LibraryManagementSystem;

import java.util.ArrayList;

/**
 * Library class
 *
 * Saari books yahan manage hongi.
 */
public class Library {

    /**
     * ArrayList dynamic size provide karta hai.
     *
     * Yahan Book objects store honge.
     */
    private ArrayList<Book> books;

    /**
     * Constructor
     */
    public Library() {
        books = new ArrayList<>();
    }

    /**
     * Add Book
     */
    public void addBook(Book book) {

        books.add(book);

        System.out.println("Book Added Successfully.");
    }

    /**
     * View All Books
     */
    public void viewBooks() {

        if (books.isEmpty()) {

            System.out.println("No Books Available.");

            return;
        }

        for (Book book : books) {

            System.out.println("----------------");
            System.out.println(book);
        }
    }

    /**
     * Search Book by ID
     */
    public Book searchBook(int id)
            throws BookNotFoundException {

        for (Book book : books) {

            if (book.getId() == id) {

                return book;
            }
        }

        throw new BookNotFoundException(
                "Book ID " + id + " Not Found"
        );
    }

    /**
     * Delete Book
     */
    public void deleteBook(int id)
            throws BookNotFoundException {

        Book book = searchBook(id);

        books.remove(book);

        System.out.println("Book Deleted Successfully.");
    }

    /**
     * Issue Book
     */
    public void issueBook(int id)
            throws BookNotFoundException,
            BookAlreadyIssuedException {

        Book book = searchBook(id);

        if (book.isIssued()) {

            throw new BookAlreadyIssuedException(
                    "Book Already Issued."
            );
        }

        book.setIssued(true);

        System.out.println("Book Issued Successfully.");
    }

    /**
     * Return Book
     */
    public void returnBook(int id)
            throws BookNotFoundException {

        Book book = searchBook(id);

        book.setIssued(false);

        System.out.println("Book Returned Successfully.");
    }
}
