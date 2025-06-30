package LocalRepo.Day4_ObjectModelling;

import java.util.*;

class Department {
    String name;

    Department(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Department: " + name);
    }
}

class Faculty {
    String facultyName;

    Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    void show() {
        System.out.println("Faculty: " + facultyName);
    }
}

class University {
    String name;
    List<Department> departments = new ArrayList<>();
    List<Faculty> faculties = new ArrayList<>();

    University(String name) {
        this.name = name;
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void addFaculty(Faculty f) {
        faculties.add(f);
    }

    void showDepartments() {
        System.out.println(name + " Departments:");
        for (Department d : departments) {
            d.show();
        }
    }

    void showFaculties() {
        System.out.println(name + " Faculties:");
        for (Faculty f : faculties) {
            f.show();
        }
    }
}

public class UniversityApp {
    public static void main(String[] args) {
        Faculty f1 = new Faculty("Dr. Anjali");
        Faculty f2 = new Faculty("Prof. Sameer");

        University uni = new University("Global Tech University");

        Department d1 = new Department("Computer Science");
        Department d2 = new Department("Physics");

        uni.addDepartment(d1);
        uni.addDepartment(d2);
        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.showDepartments();
        uni.showFaculties();

        uni = null; // University deleted → departments no longer exist

        System.out.println("\nFaculty still exists independently:");
        f1.show();
        f2.show();
    }
}

