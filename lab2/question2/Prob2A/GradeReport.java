package lesson2.lecture.assignment.Prob2A;

public class GradeReport {
    private Student student;
    private String grade;

    public GradeReport(Student student, String grade) {
        this.student = student;
        this.grade = grade;
    }

    public Student getStudent() {
        return student;
    }

    public String getGrade(){
        return grade;
    }

    @Override
    public String toString() {
        return "GradeReport{" +
                "student=" + student +
                ", grade='" + grade + '\'' +
                '}';
    }
}
