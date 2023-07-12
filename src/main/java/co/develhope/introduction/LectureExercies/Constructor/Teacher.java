package co.develhope.introduction.LectureExercies.Constructor;

/**
 * The type Teacher.
 */
public class Teacher {
    private String teacherName;

    /**
     * Gets teacher name.
     *
     * @return the teacher name
     */
    public String getTeacherName() {
        return teacherName;
    }

    /**
     * Sets teacher name.
     *
     * @param teacherName the teacher name
     */
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    /**
     * Instantiates a new Teacher.
     */
    Teacher(){
        System.out.println("Teacher Object created");
    }

    /**
     * Assign grade.
     *
     * @param alum       the alum
     * @param finalGrade the final grade
     */
    public void assignGrade(Student alum, int finalGrade ){
            alum.setGrade(finalGrade);
    }
}
