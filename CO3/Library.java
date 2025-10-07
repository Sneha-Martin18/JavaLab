// Abstract class - Abstraction
abstract class LibraryResource {
    private String title;
    private String author;

    // Constructor
    public LibraryResource(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters and Setters - Encapsulation
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Abstract method
    public abstract String getType();

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Type: " + getType());
    }
}

// Subclass - Book
class Book extends LibraryResource {
    public Book(String title, String author) {
        super(title, author);
    }

    @Override
    public String getType() {
        return "Book";
    }
}

// Subclass - Magazine
class Magazine extends LibraryResource {
    public Magazine(String title, String author) {
        super(title, author);
    }

    @Override
    public String getType() {
        return "Magazine";
    }
}

// Subclass - DVD
class DVD extends LibraryResource {
    public DVD(String title, String author) {
        super(title, author);
    }

    @Override
    public String getType() {
        return "DVD";
    }
}

// Main class to test
public class Library{
    public static void main(String[] args) {
        Book book = new Book("1984", "George Orwell");
        Magazine magazine = new Magazine("National Geographic", "John Doe");
        DVD dvd = new DVD("Inception", "Christopher Nolan");

        book.displayInfo();
        magazine.displayInfo();
        dvd.displayInfo();
    }
}
