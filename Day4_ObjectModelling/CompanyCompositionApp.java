package LocalRepo.Day4_ObjectModelling;

import java.util.*;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Employee: " + name);
    }
}

class Department {
    String deptName;
    List<Employee> employees;

    Department(String deptName) {
        this.deptName = deptName;
        employees = new ArrayList<>();
    }

    void addEmployee(String empName) {
        employees.add(new Employee(empName));
    }

    void showDepartment() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.show();
        }
    }
}

class Company {
    String companyName;
    List<Department> departments;

    Company(String companyName) {
        this.companyName = companyName;
        departments = new ArrayList<>();
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void showCompanyStructure() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.showDepartment();
            System.out.println();
        }
    }
}

public class CompanyCompositionApp {
    public static void main(String[] args) {
        Company company = new Company("TechNova Solutions");

        Department d1 = new Department("HR");
        d1.addEmployee("Aisha");
        d1.addEmployee("Rahul");

        Department d2 = new Department("IT");
        d2.addEmployee("Neha");
        d2.addEmployee("Sohail");

        company.addDepartment(d1);
        company.addDepartment(d2);

        company.showCompanyStructure();

        company = null;

        System.gc(); 
        System.out.println("\nCompany and its departments are deleted (in composition).");
    }
}

