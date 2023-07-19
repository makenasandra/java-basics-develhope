package co.develhope.introduction.Interfaces;

public class Professor extends CollegePerson implements TeachingPerson{

    String teachingSubject;
    @Override
    public void teachToOtherPeople(){
        System.out.println("I teach other students in a college");
    };
    Professor(String name,String surname, int id, String subject){
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.teachingSubject = subject;
    }
}
