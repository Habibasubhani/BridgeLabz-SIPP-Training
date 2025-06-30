package LocalRepo.Day4_ObjectModelling;

import java.util.*;

class Course {
    String courseName;
    Professor professor;
    List<Student> enrolledStudents;

    Course(String courseName) {
        this.courseName = courseName;
        enrolledStudents = new ArrayList<>();
    }

    void assignProfessor(Professor p) {
        this.professor = p;
        System.out.println("Professor " + p.name + " assigned to " + courseName);
    }

    void enrollStudent(Student s) {
        enrolledStudents.add(s);
        System.out.println(s.name + " enrolled in " + courseName);
    }

    void showCourseInfo() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Taught by: Prof. " + professor.name);
        }
        System.out.println("Enrolled Students:");
        for (Student s : enrolledStudents) {
            System.out.println("- " + s.name);
        }
        System.out.println();
    }
}

class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }
}

class Student {
    String name;
    List<Course> enrolledCourses;

    Student(String name) {
        this.name = name;
        enrolledCourses = new ArrayList<>();
    }

    void enrollCourse(Course c) {
        enrolledCourses.add(c);
        c.enrollStudent(this);
    }

    void showMyCourses() {
        System.out.println(name + "'s Courses:");
        for (Course c : enrolledCourses) {
            System.out.println("- " + c.courseName);
        }
        System.out.println();
    }
}

public class UniversityApp2 {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Dr. Mehta");

        Student s1 = new Student("Aman");
        Student s2 = new Student("Priya");

        Course c1 = new Course("Data Structures");
        Course c2 = new Course("Operating Systems");

        c1.assignProfessor(prof1);

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c2);

        System.out.println();
        s1.showMyCourses();
        s2.showMyCourses();

        c1.showCourseInfo();
        c2.showCourseInfo();
    }
}

