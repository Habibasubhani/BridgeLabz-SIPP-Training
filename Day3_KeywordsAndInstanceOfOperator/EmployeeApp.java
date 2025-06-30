package LocalRepo.Day3_KeywordsAndInstanceOfOperator;

class Employee {
    static String companyName = "TechSoft Ltd";
    static int totalEmployees = 0;

    final int id;
    String name;
    String designation;

    Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayEmployeeDetails() {
        System.out.println("Company: " + companyName);
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
    }
}

public class EmployeeApp {
    public static void main(String[] args) {
        Object e1 = new Employee(101, "Ayaan", "Developer");
        Object e2 = new Employee(102, "Megha", "Tester");

        if (e1 instanceof Employee) {
            Employee emp1 = (Employee) e1;
            emp1.displayEmployeeDetails();
            System.out.println();
        }

        if (e2 instanceof Employee) {
            Employee emp2 = (Employee) e2;
            emp2.displayEmployeeDetails();
            System.out.println();
        }

        Employee.displayTotalEmployees();
    }
}

