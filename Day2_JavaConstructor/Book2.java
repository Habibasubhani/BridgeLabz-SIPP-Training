package LocalRepo.Day2_JavaConstructor;

class Book2 {
    String title;
    String author;
    double price;
    boolean available;

    Book2(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    void borrowBook() {
        if (available) {
            available = false;
        }
    }
}

