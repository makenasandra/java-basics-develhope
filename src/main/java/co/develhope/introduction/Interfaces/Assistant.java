package co.develhope.introduction.Interfaces;

public class Assistant extends CollegePerson implements TeachingPerson, LearningPerson{

    boolean isGoingToBeAPhD;
    @Override
    public void teachToOtherPeople(){
        System.out.println("I teach other students in a college");
    }

    public void studyAtHome() {
        System.out.println("I can study at home");
    }

    Assistant(String name, String surname,int id, boolean willBeAPhD){
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.isGoingToBeAPhD = willBeAPhD;
    }
}
