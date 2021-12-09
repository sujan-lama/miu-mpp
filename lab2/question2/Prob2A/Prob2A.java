package lesson2.lecture.assignment.Prob2A;

public class Prob2A {

    public static void main(String[] args){

        Student student = new Student("Sujan Lama", "A+");
        System.out.println("Name of Student : "+student.getName() + " \nGrade is "+ student.getGradeReport().getGrade());
    }
}
