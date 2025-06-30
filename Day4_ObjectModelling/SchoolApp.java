package LocalRepo.Day4_ObjectModelling;

import java.util.*;

class Course {
    String courseName;
    List<Student> enrolledStudents = new ArrayList<>();

    Course(String courseName) {
        this.courseName = courseName;
    }

    void addStudent(Student s) {
        enrolledStudents.add(s);
    }

    void showEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student s : enrolledStudents) {
            System.out.println("- " + s.name);
        }
    }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enroll(Course c) {
        courses.add(c);
        c.addStudent(this);
    }

    void showCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println("- " + c.courseName);
        }
    }
}

class School {
    String schoolName;
    List<Student> students = new ArrayList<>();

    School(String schoolName) {
        this.schoolName = schoolName;
    }

    void addStudent(Student s) {
        students.add(s);
    }

    void listStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
    }
}

public class SchoolApp {
    public static void main(String[] args) {
        School school = new School("Springfield High");

        Student s1 = new Student("Anya");
        Student s2 = new Student("Kabir");

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        s1.enroll(c1);
        s1.enroll(c2);
        s2.enroll(c2);

        school.addStudent(s1);
        school.addStudent(s2);

        s1.showCourses();
        s2.showCourses();
        System.out.println();

        c1.showEnrolledStudents();
        c2.showEnrolledStudents();
        System.out.println();

        school.listStudents();
    }
}

