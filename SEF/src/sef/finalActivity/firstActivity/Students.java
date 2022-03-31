package sef.finalActivity.firstActivity;

public class Students extends Person {

    private String schoolName;

    public Students(String name, int age, String schoolName) throws InvalidPersonNameException {
        super(name, age);
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String introduction() {
        return super.introduction() + " I study in university " + schoolName;
    }
}
