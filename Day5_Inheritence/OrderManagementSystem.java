package LocalRepo.Day5_Inheritence;

class Order {
    String orderId;
    String orderDate;

    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order placed on " + orderDate;
    }

    void displayInfo() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Status: " + getOrderStatus());
    }
}


class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order shipped. Tracking No: " + trackingNumber;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}


public class OrderManagementSystem {
    public static void main(String[] args) {

    
        Order order = new Order("ORD123", "2025-07-05");
        System.out.println("------ Order Info ------");
        order.displayInfo();

        
        ShippedOrder shipped = new ShippedOrder("ORD124", "2025-07-04", "TRK98765");
        System.out.println("\n------ Shipped Order Info ------");
        shipped.displayInfo();

        DeliveredOrder delivered = new DeliveredOrder("ORD125", "2025-07-03", "TRK54321", "2025-07-06");
        System.out.println("\n------ Delivered Order Info ------");
        delivered.displayInfo();
    }
}

