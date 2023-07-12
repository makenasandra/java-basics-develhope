package co.develhope.introduction.LectureExercies.Constructor;

public class Student {
    private String name;
    private int grade;

    public void setGrade(int grade) {
        this.grade = grade;
    }


    Student(String studentName){
        this.name = studentName;
        System.out.println("Student Object created");
    }

    public void getStudentDetails() {
        System.out.println(
                "name=" + name  +
                ", grade=" + grade);
    }
}
