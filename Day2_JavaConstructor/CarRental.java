package LocalRepo.Day2_JavaConstructor;

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    CarRental() {
        this("Unknown", "Generic", 1);
    }

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost(double dailyRate) {
        return rentalDays * dailyRate;
    }
}

