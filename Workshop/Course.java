package LocalRepo.Workshop;

import java.util.*;

public class Course {
    private String code;
    private String title;
    private List<Enrollment> enrollments = new ArrayList<>();

    public Course(String code, String title) {
        this.code = code;
        this.title = title;
    }

    public void addEnrollment(Enrollment e) {
        enrollments.add(e);
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }
}

