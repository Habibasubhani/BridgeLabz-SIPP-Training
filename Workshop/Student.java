package LocalRepo.Workshop;

import java.util.*;

public class Student {
    private String name;
    private int id;
    private double GPA;
    private List<Enrollment> transcript = new ArrayList<>();

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Student(String name, int id, List<Course> electives) {
        this.name = name;
        this.id = id;
        for (Course course : electives) {
            enrollInCourse(course);
        }
    }

    public void enrollInCourse(Course course) {
        Enrollment e = new Enrollment(this, course);
        transcript.add(e);
        course.addEnrollment(e);
    }

    public double getGPA() {
        return GPA;
    }

    protected void updateGPA(double newGPA) {
        this.GPA = newGPA;
    }

    public List<Enrollment> getTranscript() {
        return transcript;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

