package LibraryManagementSystem;

import java.util.Scanner;

/**
 * LibraryManager
 *
 * UI Layer
 * User aur Library ke beech bridge ka kaam karta hai.
 */
public class LibraryManager {

    private Library library;
    private Scanner scanner;

    /**
     * Constructor
     */
    public LibraryManager() {

        library = new Library();

        scanner = new Scanner(System.in);
    }

    /**
     * Main Menu
     */
    public void start() {

        while (true) {

            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");

            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. Exit");

            System.out.print("Enter Choice : ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    addBook();
                    break;

                case 2:
                    library.viewBooks();
                    break;

                case 3:
                    searchBook();
                    break;

                case 4:
                    deleteBook();
                    break;

                case 5:
                    issueBook();
                    break;

                case 6:
                    returnBook();
                    break;

                case 7:
                    System.out.println("Thank You.");
                    return;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }

    /**
     * Add Book
     */
    private void addBook() {

        System.out.print("Enter Book ID : ");
        int id = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter Title : ");
        String title = scanner.nextLine();

        System.out.print("Enter Author : ");
        String author = scanner.nextLine();

        Book book = new Book(id, title, author);

        library.addBook(book);
    }

    /**
     * Search Book
     */
    private void searchBook() {

        try {

            System.out.print("Enter Book ID : ");

            int id = scanner.nextInt();

            Book book = library.searchBook(id);

            System.out.println(book);

        } catch (BookNotFoundException e) {

            System.out.println(e.getMessage());
        }
    }

    /**
     * Delete Book
     */
    private void deleteBook() {

        try {

            System.out.print("Enter Book ID : ");

            int id = scanner.nextInt();

            library.deleteBook(id);

        } catch (BookNotFoundException e) {

            System.out.println(e.getMessage());
        }
    }

    /**
     * Issue Book
     */
    private void issueBook() {

        try {

            System.out.print("Enter Book ID : ");

            int id = scanner.nextInt();

            library.issueBook(id);

        } catch (BookNotFoundException |
                 BookAlreadyIssuedException e) {

            System.out.println(e.getMessage());
        }
    }

    /**
     * Return Book
     */
    private void returnBook() {

        try {

            System.out.print("Enter Book ID : ");

            int id = scanner.nextInt();

            library.returnBook(id);

        } catch (BookNotFoundException e) {

            System.out.println(e.getMessage());
        }
    }
}