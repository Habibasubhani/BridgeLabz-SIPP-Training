package LocalRepo.Day4_ObjectModelling;

import java.util.ArrayList;
import java.util.List;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class Library {
    String libraryName;
    List<Book> books;

    Library(String libraryName) {
        this.libraryName = libraryName;
        books = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
    }

    void showLibraryBooks() {
        System.out.println("Books in " + libraryName + ":");
        for (Book b : books) {
            b.displayBook();
        }
        System.out.println();
    }
}

public class LibraryAggregationApp {
    public static void main(String[] args) {
        Book b1 = new Book("Wings of Fire", "A.P.J Abdul Kalam");
        Book b2 = new Book("The Alchemist", "Paulo Coelho");
        Book b3 = new Book("Atomic Habits", "James Clear");

        Library lib1 = new Library("City Library");
        Library lib2 = new Library("Town Library");

        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2); 
        lib2.addBook(b3);

        lib1.showLibraryBooks();
        lib2.showLibraryBooks();
    }
}
