package LocalRepo.Day2_JavaConstructor;

class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "ABC Institute";

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
    }

    static void updateInstituteName(String name) {
        instituteName = name;
    }
}

public class CourseManagementApp {
    public static void main(String[] args) {
        Course c1 = new Course("Java", 8, 4000);
        Course c2 = new Course("Python", 6, 3500);

        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
        System.out.println();

        Course.updateInstituteName("XYZ Academy");

        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
    }
}

