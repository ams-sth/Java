package OOP.encapsulation.library_system;

public class Library {
    private String Author;
    private String Title;
    private String ISBN;

    public Library(String writer, String title, String isbn) {
        Author = writer;
        Title = title;
        ISBN = isbn;
    }

    public void getAuthor() {
        System.out.println("Name of the author :  " + Author);
    }

    public void getTitle() {
        System.out.println("Title of the book : " + Title);
    }

    public void getISBN() {
        System.out.println("ISBN : " + ISBN);
    }

    public void issueBook(String username, int userID, double borrowedDate, double returnDate) {
        System.out.println("Borrowed by : " + userID);
        System.out.println("Borrower's Name : " + username);
        System.out.println("Borrowed Date : " + borrowedDate);
        System.out.println("Return Date : " + returnDate);
    }

    public static void main(String[] args) {
        Library library = new Library("Erin Morgenstern", "The Night Circus", "0307744432");

        library.getTitle();
        library.getAuthor();
        library.getISBN();

        library.issueBook("John", 132, 12.10, 12.14);

    }
}
