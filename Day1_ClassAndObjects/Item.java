package LocalRepo.Day1_ClassAndObjects;

class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per item: ₹" + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item item = new Item(1001, "Notebook", 50.0);
        item.displayDetails();
        System.out.println("Total cost for 5 items: ₹" + item.calculateTotalCost(5));
    }
}

