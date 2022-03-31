package sef.finalActivity.firstActivity;

public class Student extends Person {

    public String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
public String introducePerson() {
        return "I study in university " + schoolName;
}


}
