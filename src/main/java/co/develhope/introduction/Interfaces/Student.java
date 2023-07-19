package co.develhope.introduction.Interfaces;

public class Student extends CollegePerson implements LearningPerson{

    private int academicYear;
    @Override
    public void studyAtHome() {
        System.out.println("This student studies at home");
    }

    Student(String name,String surname,int id,int year){
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.academicYear = year;
    }
}
