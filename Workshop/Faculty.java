package LocalRepo.Workshop;

public class Faculty implements Graded {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    @Override
    public void assignGrade(Enrollment enrollment, String grade) {
        enrollment.setGrade(grade);
        System.out.println(name + " assigned grade '" + grade + "' to student " +
                enrollment.getStudent().getName() + " for course " +
                enrollment.getCourse().getTitle());
    }
}

