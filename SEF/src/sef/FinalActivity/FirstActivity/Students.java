package sef.FinalActivity.FirstActivity;

public class Students extends Person {
    //Attributes
    private String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String introduction() {
        String message = "I am study in university " + schoolName;
        return message;
    }
}
