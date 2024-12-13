package OOP.encapsulation.library_system;

public class Main {
    public static void main(String[] args) {
        User user = new User("John", 1);
        Library library = new Library("Erin Morgenstern", "The Night Circus", "0307744432");
        library.issueBook(user,"12.12.24", "14.12.24");
    }
}
