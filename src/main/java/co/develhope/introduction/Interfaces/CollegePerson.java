package co.develhope.introduction.Interfaces;

public class CollegePerson {
    String name;
    String surname;
    int collegeId;

    public void goToCollege() {
        System.out.println("name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", collegeId=" + collegeId);
    }
}
