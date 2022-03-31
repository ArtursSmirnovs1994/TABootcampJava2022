package sef.FinalActivity.FirstActivity;

public class Students extends Person{
    String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String introduceStudent()
    {
        return "I am Studying in University "+ schoolName;
    }

}
