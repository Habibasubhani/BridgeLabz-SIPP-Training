package LocalRepo.Day2_JavaConstructor;

class Book {
    public String ISBN;
    protected String title;
    private String author;

    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class EBook extends Book {
    double fileSize;

    EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void displayEBookDetails() {
        System.out.println("Accessing Public ISBN: " + ISBN);
        System.out.println("Accessing Protected Title: " + title);
        System.out.println("EBook Size: " + fileSize + " MB");
    }
}

public class LibraryApp {
    public static void main(String[] args) {
        Book b1 = new Book("978-0140449136", "The Odyssey", "Homer");
        b1.displayBookDetails();
        System.out.println();

        b1.setAuthor("Homer (Edited)");
        System.out.println("Updated Author: " + b1.getAuthor());
        System.out.println();

        EBook eb1 = new EBook("978-0134685991", "Effective Java", "Joshua Bloch", 5.8);
        eb1.displayEBookDetails();
        System.out.println();

        eb1.displayBookDetails();
    }
}
