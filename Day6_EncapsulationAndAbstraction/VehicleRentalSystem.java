package LocalRepo.Day6_EncapsulationAndAbstraction;

import java.util.*;


interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }


    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    public void setRentalRate(double rentalRate) { this.rentalRate = rentalRate; }

  
    public abstract double calculateRentalCost(int days);

    public void displayVehicleInfo() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate per Day: ₹" + rentalRate);
    }
}


class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 1500.0; // flat insurance for Car
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy No: " + insurancePolicyNumber;
    }

    @Override
    public void displayVehicleInfo() {
        super.displayVehicleInfo();
        System.out.println(getInsuranceDetails());
    }
}

class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 500.0; // flat insurance for Bike
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy No: " + insurancePolicyNumber;
    }

    @Override
    public void displayVehicleInfo() {
        super.displayVehicleInfo();
        System.out.println(getInsuranceDetails());
    }
}

class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        // Extra cost for heavy load
        return getRentalRate() * days + 1000;
    }

    @Override
    public double calculateInsurance() {
        return 3000.0; // flat insurance for Truck
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy No: " + insurancePolicyNumber;
    }

    @Override
    public void displayVehicleInfo() {
        super.displayVehicleInfo();
        System.out.println(getInsuranceDetails());
    }
}


public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("CAR123", 1500, "CARINS123"));
        vehicles.add(new Bike("BIK456", 500, "BIKEINS456"));
        vehicles.add(new Truck("TRK789", 2500, "TRUCKINS789"));

        int rentalDays = 5;

        System.out.println("=== Vehicle Rental Summary ===");
        for (Vehicle v : vehicles) {
            System.out.println("\n--- Vehicle Info ---");
            v.displayVehicleInfo();

            double rent = v.calculateRentalCost(rentalDays);
            double insurance = 0;
            if (v instanceof Insurable) {
                insurance = ((Insurable) v).calculateInsurance();
            }

            System.out.printf("Rental Cost for %d days: ₹%.2f\n", rentalDays, rent);
            System.out.printf("Insurance Cost: ₹%.2f\n", insurance);
            System.out.printf("Total Cost: ₹%.2f\n", rent + insurance);
        }
    }
}

