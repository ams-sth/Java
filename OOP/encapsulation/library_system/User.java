package OOP.encapsulation.library_system;

public class User {
    private String username;
    private int userID;

    public User(String uName, int uID) {
        username = uName;
        userID = uID;
    }

    public String getUsername() {
        return username;
    }

    public int getUserID() {
        return userID;
    }
}
