package classandobjects;

public class House  {

    // Attributes: Variables declared inside a class.
    public String owner;
    public int numberOfRooms;
    public boolean hasHall;
    public String securityLevel;

    // Constructor: They are built-in functions with no data-type.
    public House(String owner, int numberOfRooms, boolean hasHall, String securityLevel) {
        this.owner = owner;
        this.numberOfRooms = numberOfRooms;
        this.hasHall = hasHall;
        this.securityLevel = securityLevel;
    }

    // Methods: Functions defined inside class.

    // Method 1
    public void provideSecurity() {
        System.out.println("Security strength: " + securityLevel);
    }

    // Method 2
    public void displayHouseDetails() {
        System.out.println("House Details:");
        System.out.println("Owner: " + owner);
        System.out.println("Number of Rooms in the house: " + numberOfRooms);
        System.out.println("Are there halls in the house ? " + (hasHall ? "Yes" : "No"));
        provideSecurity();
    }

    public static void main(String[] args) {
        // Object creation
        House house1 = new House("John", 8, true, "Strong");
        house1.displayHouseDetails();
    }
}
