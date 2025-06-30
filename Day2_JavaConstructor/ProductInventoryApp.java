package LocalRepo.Day2_JavaConstructor;

class Product {
    String productName;
    double price;
    static int totalProducts = 0;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    void displayProductDetails() {
        System.out.println("Product: " + productName);
        System.out.println("Price: " + price);
    }

    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}

public class ProductInventoryApp {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 45000);
        Product p2 = new Product("Phone", 20000);

        p1.displayProductDetails();
        System.out.println();
        p2.displayProductDetails();
        System.out.println();

        Product.displayTotalProducts();
    }
}

