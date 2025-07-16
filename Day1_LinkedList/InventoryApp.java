package LocalRepo.Day1_LinkedList;

import java.util.Scanner;

class Item {
    String name;
    int id;
    int quantity;
    double price;
    Item next;

    Item(String name, int id, int quantity, double price) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class InventoryLinkedList {
    Item head = null;

    void addAtBeginning(String name, int id, int quantity, double price) {
        Item newItem = new Item(name, id, quantity, price);
        newItem.next = head;
        head = newItem;
    }

    void addAtEnd(String name, int id, int quantity, double price) {
        Item newItem = new Item(name, id, quantity, price);
        if (head == null) {
            head = newItem;
        } else {
            Item temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newItem;
        }
    }

    void addAtPosition(int pos, String name, int id, int quantity, double price) {
        if (pos <= 0) {
            System.out.println("Invalid position.");
            return;
        }
        if (pos == 1) {
            addAtBeginning(name, id, quantity, price);
            return;
        }

        Item temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of range.");
            return;
        }

        Item newItem = new Item(name, id, quantity, price);
        newItem.next = temp.next;
        temp.next = newItem;
    }

    void removeById(int id) {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }

        if (head.id == id) {
            head = head.next;
            System.out.println("Item removed.");
            return;
        }

        Item temp = head;
        while (temp.next != null && temp.next.id != id) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Item not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Item removed.");
        }
    }

    void updateQuantity(int id, int newQuantity) {
        Item temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.quantity = newQuantity;
                System.out.println("Quantity updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }

    void search(String type, String value) {
        boolean found = false;
        Item temp = head;

        while (temp != null) {
            if ((type.equalsIgnoreCase("id") && String.valueOf(temp.id).equals(value)) ||
                (type.equalsIgnoreCase("name") && temp.name.equalsIgnoreCase(value))) {
                System.out.println("Item: Name=" + temp.name + ", ID=" + temp.id + ", Qty=" + temp.quantity + ", Price=" + temp.price);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) System.out.println("Item not found.");
    }

    void totalInventoryValue() {
        double total = 0;
        Item temp = head;
        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: ₹" + total);
    }

    void displayInventory() {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }

        Item temp = head;
        while (temp != null) {
            System.out.println("Item: Name=" + temp.name + ", ID=" + temp.id + ", Qty=" + temp.quantity + ", Price=" + temp.price);
            temp = temp.next;
        }
    }

    Item mergeSort(Item node, String criteria, boolean ascending) {
        if (node == null || node.next == null) return node;

        Item middle = getMiddle(node);
        Item nextOfMiddle = middle.next;
        middle.next = null;

        Item left = mergeSort(node, criteria, ascending);
        Item right = mergeSort(nextOfMiddle, criteria, ascending);

        return sortedMerge(left, right, criteria, ascending);
    }

    Item sortedMerge(Item a, Item b, String criteria, boolean ascending) {
        if (a == null) return b;
        if (b == null) return a;

        boolean condition;
        if (criteria.equalsIgnoreCase("name")) {
            condition = ascending ? a.name.compareToIgnoreCase(b.name) <= 0 : a.name.compareToIgnoreCase(b.name) > 0;
        } else {
            condition = ascending ? a.price <= b.price : a.price > b.price;
        }

        if (condition) {
            a.next = sortedMerge(a.next, b, criteria, ascending);
            return a;
        } else {
            b.next = sortedMerge(a, b.next, criteria, ascending);
            return b;
        }
    }

    Item getMiddle(Item node) {
        if (node == null) return node;

        Item slow = node, fast = node.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    void sortInventory(String criteria, boolean ascending) {
        head = mergeSort(head, criteria, ascending);
        System.out.println("Inventory sorted by " + criteria + " (" + (ascending ? "Ascending" : "Descending") + ")");
    }
}

public class InventoryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InventoryLinkedList inventory = new InventoryLinkedList();

        while (true) {
            System.out.println("\n--- INVENTORY MENU ---");
            System.out.println("1. Add Item at Beginning");
            System.out.println("2. Add Item at End");
            System.out.println("3. Add Item at Position");
            System.out.println("4. Remove Item by ID");
            System.out.println("5. Update Quantity by ID");
            System.out.println("6. Search by ID or Name");
            System.out.println("7. Display Inventory");
            System.out.println("8. Total Inventory Value");
            System.out.println("9. Sort Inventory (Name or Price)");
            System.out.println("10. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine(); 

            switch (ch) {
                case 1:
                    System.out.print("Enter Name, ID, Qty, Price: ");
                    inventory.addAtBeginning(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter Name, ID, Qty, Price: ");
                    inventory.addAtEnd(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextDouble());
                    break;
                case 3:
                    System.out.print("Enter Position: ");
                    int pos = sc.nextInt();
                    System.out.print("Enter Name, ID, Qty, Price: ");
                    inventory.addAtPosition(pos, sc.next(), sc.nextInt(), sc.nextInt(), sc.nextDouble());
                    break;
                case 4:
                    System.out.print("Enter Item ID to remove: ");
                    inventory.removeById(sc.nextInt());
                    break;
                case 5:
                    System.out.print("Enter Item ID and New Quantity: ");
                    inventory.updateQuantity(sc.nextInt(), sc.nextInt());
                    break;
                case 6:
                    System.out.print("Search by (id/name): ");
                    String type = sc.next();
                    System.out.print("Enter value: ");
                    inventory.search(type, sc.next());
                    break;
                case 7:
                    inventory.displayInventory();
                    break;
                case 8:
                    inventory.totalInventoryValue();
                    break;
                case 9:
                    System.out.print("Sort by (name/price): ");
                    String field = sc.next();
                    System.out.print("Order (asc/desc): ");
                    boolean asc = sc.next().equalsIgnoreCase("asc");
                    inventory.sortInventory(field, asc);
                    break;
                case 10:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

