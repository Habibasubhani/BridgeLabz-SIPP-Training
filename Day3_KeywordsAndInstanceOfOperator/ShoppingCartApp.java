package LocalRepo.Day3_KeywordsAndInstanceOfOperator;

class Product {
    static double discount = 10.0;

    final int productID;
    String productName;
    double price;
    int quantity;

    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayProductDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
    }
}

public class ShoppingCartApp {
    public static void main(String[] args) {
        Object p1 = new Product(1, "Laptop", 50000.0, 1);
        Object p2 = new Product(2, "Headphones", 2500.0, 2);

        if (p1 instanceof Product) {
            Product prod1 = (Product) p1;
            prod1.displayProductDetails();
            System.out.println();
        }

        if (p2 instanceof Product) {
            Product prod2 = (Product) p2;
            prod2.displayProductDetails();
            System.out.println();
        }

        Product.updateDiscount(15.0);
        System.out.println("Updated Discount: " + Product.discount + "%");
    }
}

