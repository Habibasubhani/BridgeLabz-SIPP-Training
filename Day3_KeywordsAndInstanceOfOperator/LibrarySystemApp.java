package LocalRepo.Day3_KeywordsAndInstanceOfOperator;

class Book {
    static String libraryName = "City Central Library";

    final String isbn;
    String title;
    String author;

    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayBookDetails() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class LibrarySystemApp {
    public static void main(String[] args) {
        Object b1 = new Book("9780134685991", "Effective Java", "Joshua Bloch");
        Object b2 = new Book("9780596009205", "Head First Java", "Kathy Sierra");

        Book.displayLibraryName();
        System.out.println();

        if (b1 instanceof Book) {
            Book book1 = (Book) b1;
            book1.displayBookDetails();
            System.out.println();
        }

        if (b2 instanceof Book) {
            Book book2 = (Book) b2;
            book2.displayBookDetails();
        }
    }
}

