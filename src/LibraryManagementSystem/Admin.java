package LibraryManagementSystem;

/**
 * Admin class
 *
 * Person ko inherit kar rahi hai.
 */
public class Admin extends Person {

    public Admin(int id, String name) {
        super(id, name);
    }

    /**
     * Admin role show karega.
     */
    @Override
    public void showRole() {
        System.out.println("Role : Admin");
    }

    @Override
    public String toString() {
        return "Admin ID : " + getId() +
                "\nName : " + getName();
    }
}