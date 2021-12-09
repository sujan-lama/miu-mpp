package lesson2.lecture.assignment.Prob2A;

public class Student {

    private String name;
    private GradeReport gradeReport;

    public Student(String name, String grade) {
        this.name = name;
        gradeReport = new GradeReport(this, grade);
    }

    public String getName() {
        return name;
    }

    public GradeReport getGradeReport() {
        return gradeReport;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradeReport=" + gradeReport +
                '}';
    }
}
