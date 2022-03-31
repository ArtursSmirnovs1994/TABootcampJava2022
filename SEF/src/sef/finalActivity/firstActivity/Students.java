package sef.finalActivity.firstActivity;

public class Students extends Person {
    private String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String introduce() {
        String statement = "I am study in university " + schoolName;
        return statement;
    }
}
