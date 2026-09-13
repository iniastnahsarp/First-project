package LibraryManagementSystem;

/**
 * User class
 *
 * Person ko inherit kar rahi hai.
 */
public class User extends Person {

    /**
     * Constructor
     *
     * super() parent constructor ko call karta hai.
     */
    public User(int id, String name) {
        super(id, name);
    }

    /**
     * Abstract method implementation
     */
    @Override
    public void showRole() {
        System.out.println("Role : User");
    }

    @Override
    public String toString() {
        return "User ID : " + getId() +
                "\nName : " + getName();
    }
}