package sef.finalActivity.firstActivity;

public class Student extends Person {
    private String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void studentIntroduction(String schoolName) {
        System.out.println("I am studying in university " + schoolName);
    }
}
