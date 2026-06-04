package Discussion10;

class Books {
    int bookId;
    String bookName;
    String bookAuthor;
    String yearOfPub;
    double price;
    String status;

    Books(int bookId, String bookName, String bookAuthor,String yearOfPub, double price, String status) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.yearOfPub = yearOfPub;
        this.price = price;
        this.status = status;
    }

    void addNewBooks() {
        System.out.println(bookName + " added to library.");
    }

    void deleteBooks() {
        System.out.println(bookName + " removed from library.");
    }

    void displayBookDetails() {
        System.out.println("Book Details:");
        System.out.println("Book ID: " + bookId);
        System.out.println("Name: " + bookName);
        System.out.println("Author: " + bookAuthor);
        System.out.println("Year: " + yearOfPub);
        System.out.println("Price: " + price);
        System.out.println("Status: " + status);
    }

}


class Librarian {
    int id;
    String name;

    Librarian(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void searchBook(String bookName) {
        System.out.println("Searching for: " + bookName);
    }

    void orderBooks() {
        System.out.println("Books ordered successfully.");
    }

    void sellBooks() {
        System.out.println("Books sold successfully.");
    }
}


class Publisher {
    int id;
    String name;
    String address;
    String phoneNo;

    Publisher(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void addPub() {
        System.out.println("Publisher added.");
    }

    void modifyPub() {
        System.out.println("Publisher  modified.");
    }

    void deletePub() {
        System.out.println("Publisher deleted.");
    }

    void orderStatus() {
        System.out.println("Order is done.");
    }
}


class User {
    int userID;
    String userName;
    String userAddress;
    

    User(int userID, String userName,String userAddress) {
        this.userID = userID;
        this.userName = userName;
        this.userAddress = userAddress;
    }

    void returnBook() {
        System.out.println(userName + " returned a book.");
    }

    void addNewUser() {
        System.out.println("User added.");
    }

    void deleteUser() {
        System.out.println("User deleted.");
    }

    void updateDetails() {
        System.out.println("details updated.");
    }

    void bookPurchase() {
        System.out.println(userName + " purchased a book.");
    }
}


public class libraryDemo {
    public static void main(String[] args) {

        Books b1 = new Books(101,"Java","Unknown","2022",450,"Available");
        Librarian l1 = new Librarian(1, "Rahim");
        Publisher p1 = new Publisher(10,"sust Ltd","Dhaka");
        User u = new User(1001,"Fuad","Chattogram");


        b1.addNewBooks();
        b1.displayBookDetails();

        l1.searchBook("Java Programming");

        p1.addPub();
        p1.orderStatus();

        u.addNewUser();
        u.bookPurchase();
        u.returnBook();
    }
}