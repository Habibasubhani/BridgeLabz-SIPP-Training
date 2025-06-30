package LocalRepo.Day2_JavaConstructor;

class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

class PostgraduateStudent extends Student {
    String specialization;

    PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void displayPostgraduateDetails() {
        System.out.println("PG Student Name (Protected Access): " + name);
        System.out.println("Specialization: " + specialization);
    }
}

public class UniversityApp {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Aman", 8.5);
        s1.displayStudentDetails();
        System.out.println();

        s1.setCGPA(9.0);
        System.out.println("Updated CGPA: " + s1.getCGPA());
        System.out.println();

        PostgraduateStudent pg1 = new PostgraduateStudent(102, "Meera", 9.2, "Computer Science");
        pg1.displayStudentDetails();
        System.out.println();
        pg1.displayPostgraduateDetails();
    }
}
