package LocalRepo.Day6_EncapsulationAndAbstraction;

import java.util.*;


interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

   
    public String getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }

   
    public abstract double calculateDiscount();

 
    public void displayInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: ₹" + price);
    }
}


class Electronics extends Product implements Taxable {
    private double warrantyInYears;

    public Electronics(String productId, String name, double price, double warrantyInYears) {
        super(productId, name, price);
        this.warrantyInYears = warrantyInYears;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10; 
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; 
    }

    @Override
    public String getTaxDetails() {
        return "GST 18% for Electronics";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Warranty: " + warrantyInYears + " years");
        System.out.println(getTaxDetails());
    }
}


class Clothing extends Product implements Taxable {
    private String size;

    public Clothing(String productId, String name, double price, String size) {
        super(productId, name, price);
        this.size = size;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.12;
    }

    @Override
    public String getTaxDetails() {
        return "GST 12% for Clothing";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Size: " + size);
        System.out.println(getTaxDetails());
    }
}


class Groceries extends Product {
    private String expiryDate;

    public Groceries(String productId, String name, double price, String expiryDate) {
        super(productId, name, price);
        this.expiryDate = expiryDate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; 
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("No tax on Groceries");
    }
}


public class ECommercePlatform {

    public static void printFinalPrice(List<Product> productList) {
        for (Product p : productList) {
            System.out.println("\n--- Product Info ---");
            p.displayInfo();

            double discount = p.calculateDiscount();
            double tax = 0;

            if (p instanceof Taxable) {
                tax = ((Taxable) p).calculateTax();
            }

            double finalPrice = p.getPrice() + tax - discount;

            System.out.printf("Discount: ₹%.2f\n", discount);
            System.out.printf("Tax: ₹%.2f\n", tax);
            System.out.printf("Final Price: ₹%.2f\n", finalPrice);
        }
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Electronics("E101", "Laptop", 70000, 2));
        products.add(new Clothing("C202", "T-Shirt", 1500, "M"));
        products.add(new Groceries("G303", "Rice Bag", 1200, "2025-08-01"));

        printFinalPrice(products);
    }
}

