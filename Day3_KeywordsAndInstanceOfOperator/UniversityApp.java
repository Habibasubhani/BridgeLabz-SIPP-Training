package LocalRepo.Day3_KeywordsAndInstanceOfOperator;

class Student {
    static String universityName = "Global University";
    static int totalStudents = 0;

    final int rollNumber;
    String name;
    char grade;

    Student(int rollNumber, String name, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public void displayStudentDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }

    public void updateGrade(char newGrade) {
        this.grade = newGrade;
    }
}

public class UniversityApp {
    public static void main(String[] args) {
        Object s1 = new Student(101, "Riya", 'A');
        Object s2 = new Student(102, "Yash", 'B');

        if (s1 instanceof Student) {
            Student student1 = (Student) s1;
            student1.displayStudentDetails();
            student1.updateGrade('A');
            System.out.println("Updated Grade: " + student1.grade);
            System.out.println();
        }

        if (s2 instanceof Student) {
            Student student2 = (Student) s2;
            student2.displayStudentDetails();
            System.out.println();
        }

        Student.displayTotalStudents();
    }
}

