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

    public String getAuthor() {
        return Author;
    }

    public String getTitle() {
        return Title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void issueBook(User user, String borrowedDate, String returnDate) {
        System.out.println("Book's title : " + getTitle());
        System.out.println("Book's author : " + getAuthor());
        System.out.println("Book's ISBN : " + getISBN());
        System.out.println("Borrower's userID : " + user.getUserID());
        System.out.println("Borrower's Name : " + user.getUsername());
        System.out.println("Borrowed Date : " + borrowedDate);
        System.out.println("Return Date : " + returnDate);
    }

}
