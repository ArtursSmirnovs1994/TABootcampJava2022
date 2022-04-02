package sef.FinalActivity.FirstActivity;

public class Students extends Person {

    private String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String announceStudents() {

        return ("I study in the " +schoolName+"." );
    }

}