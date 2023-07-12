package co.develhope.introduction.LectureExercies.Constructor;

/**
 * Exercise - Constructor
 * define a class called Student that has:
 * a string instance variable name
 * a int instance variable grade
 * a constructor method that
 * informs the user about the object creation
 * takes a studentName parameter and assign it to the object's instance variable name
 * a method getStudentDetails() that prints a student name and grade
 * define a class called Teacher that has:
 * a string instance variable called teacherName
 * a constructor method that simply inform the user about the creation of a Teacher object
 * a method assignGrade() that
 * takes 2 params:
 * alum of type Student
 * a int finalGrade
 * assigns finalGrade to the Student's grade
 * define a testing class where you:
 * create 2 students
 * create 1 teacher
 * assign a name to the teacher
 * assign grades to the 2 students
 * prints the students' details
 */

public class TestClass {
    public static void main(String[] args) {
        Student std1 = new Student("Ann");
        Student std2 = new Student("Yunasi");

        Teacher mwalimu = new Teacher();

        mwalimu.setTeacherName("Mauka");

        mwalimu.assignGrade(std1, 95);
        mwalimu.assignGrade(std2, 88);

        std1.getStudentDetails();
        std2.getStudentDetails();

    }
}
