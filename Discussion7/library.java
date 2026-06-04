package Discussion7;

class Book {
    String title;
    String author;


    Book(String title) {
        this.title = title;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class library {
    public static void main(String[] args) {
        Book b1 = new Book("Fun with Java");
        Book b2 = new Book("Code", "Fuad");

        b1.display();
        System.out.println();
        b2.display();
    }
}
