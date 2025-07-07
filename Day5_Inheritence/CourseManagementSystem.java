package LocalRepo.Day5_Inheritence;

class Course {
    String courseName;
    int duration; 

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded Sessions: " + (isRecorded ? "Yes" : "No"));
    }
}


class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount; 

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    double getFinalPrice() {
        return fee - (fee * discount / 100);
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Fee: ₹" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: ₹" + getFinalPrice());
    }
}

public class CourseManagementSystem {
    public static void main(String[] args) {

    
        System.out.println("----- Course Info -----");
        Course c1 = new Course("Java Basics", 6);
        c1.displayInfo();

        System.out.println("\n----- Online Course Info -----");
        OnlineCourse c2 = new OnlineCourse("Web Development", 8, "Udemy", true);
        c2.displayInfo();

       
        System.out.println("\n----- Paid Online Course Info -----");
        PaidOnlineCourse c3 = new PaidOnlineCourse("Data Structures", 10, "Coursera", false, 4999.0, 20.0);
        c3.displayInfo();
    }
}

