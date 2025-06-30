package LocalRepo.Day4_ObjectModelling;

import java.util.*;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void displayProduct() {
        System.out.println("- " + name + " ₹" + price);
    }
}

class Order {
    int orderId;
    List<Product> productList;

    Order(int orderId) {
        this.orderId = orderId;
        productList = new ArrayList<>();
    }

    void addProduct(Product p) {
        productList.add(p);
    }

    void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products:");
        for (Product p : productList) {
            p.displayProduct();
        }
    }
}

class Customers {
    String name;
    List<Order> orders;

    Customers(String name) {
        this.name = name;
        orders = new ArrayList<>();
    }

    void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed Order ID: " + order.orderId);
    }

    void viewOrders() {
        System.out.println("Orders placed by " + name + ":");
        for (Order o : orders) {
            o.showOrderDetails();
            System.out.println();
        }
    }
}

public class ECommerceApp {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 55000.0);
        Product p2 = new Product("Mouse", 700.0);
        Product p3 = new Product("Keyboard", 1500.0);

        Customers c1 = new Customers("Zoya");

        Order o1 = new Order(1001);
        o1.addProduct(p1);
        o1.addProduct(p2);

        Order o2 = new Order(1002);
        o2.addProduct(p3);

        c1.placeOrder(o1);
        c1.placeOrder(o2);

        System.out.println();
        c1.viewOrders();
    }
}

