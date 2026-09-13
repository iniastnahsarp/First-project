package LibraryManagementSystem;

/**
 * Abstract class
 *
 * Direct object create nahi kar sakte.
 * Ye sirf common properties provide karegi.
 *
 * User aur Admin dono Person se inherit karenge.
 */
public abstract class Person {

    // Common fields
    private int id;
    private String name;

    /**
     * Constructor
     *
     * Jab User ya Admin object banega
     * tab ye constructor bhi call hoga.
     */
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Abstract Method
     *
     * Har child class ko implement karna padega.
     */
    public abstract void showRole();
}
