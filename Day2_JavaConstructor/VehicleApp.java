package LocalRepo.Day2_JavaConstructor;

class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 500.0;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

public class VehicleApp {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ravi", "Car");
        Vehicle v2 = new Vehicle("Priya", "Bike");

        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
        System.out.println();

        Vehicle.updateRegistrationFee(750.0);

        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
    }
}
