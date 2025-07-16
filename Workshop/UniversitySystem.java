package LocalRepo.Workshop;

import java.util.*;

public class UniversitySystem {
    public static void main(String[] args) {
        Course c1 = new Course("CS101", "Operating Systems");
        Course c2 = new Course("CS102", "Computer Networks");

        List<Course> electives = Arrays.asList(c1, c2);

        Undergraduate student = new Undergraduate("Riya Sharma", 1001, electives);
        Faculty prof = new Faculty("Dr. Sen");

        prof.assignGrade(student.getTranscript().get(0), "A+");
        prof.assignGrade(student.getTranscript().get(1), "A");

        System.out.println("\n--- Transcript for " + student.getName() + " ---");
        for (Enrollment e : student.getTranscript()) {
            System.out.println("Course: " + e.getCourse().getTitle() +
                               " | Grade: " + e.getGrade());
        }
    }
}

