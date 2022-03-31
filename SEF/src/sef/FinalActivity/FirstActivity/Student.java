package sef.FinalActivity.FirstActivity;

public class Student extends Person {

    public Student(String schoolName) {
        this.schoolName = schoolName;
    }

    public Student(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
    }

    private String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String introduceYourself() {
        String introduction = String.format("I study in %s", schoolName);
        return introduction;
    }
}
