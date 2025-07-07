package LocalRepo.Day5_Inheritence;


class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}


interface Worker {
    void performDuties();  

}
class Chef extends Person implements Worker {

    String specialty;

    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println("Duties: Cooking " + specialty + " dishes.");
    }

    @Override
    void displayPersonInfo() {
        super.displayPersonInfo();
        System.out.println("Role: Chef");
        System.out.println("Specialty: " + specialty);
        performDuties();
    }
}


class Waiter extends Person implements Worker {

    int tablesAssigned;

    Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    @Override
    public void performDuties() {
        System.out.println("Duties: Serving customers at " + tablesAssigned + " tables.");
    }

    @Override
    void displayPersonInfo() {
        super.displayPersonInfo();
        System.out.println("Role: Waiter");
        System.out.println("Tables Assigned: " + tablesAssigned);
        performDuties();
    }
}


public class RestaurantManagementSystem {
    public static void main(String[] args) {
        System.out.println("---- Chef Info ----");
        Chef chef = new Chef("Aman", 101, "Italian");
        chef.displayPersonInfo();

        System.out.println("\n---- Waiter Info ----");
        Waiter waiter = new Waiter("Ravi", 202, 5);
        waiter.displayPersonInfo();
    }
}

