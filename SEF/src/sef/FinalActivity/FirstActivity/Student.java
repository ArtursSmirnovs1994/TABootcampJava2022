package sef.FinalActivity.FirstActivity;

import sef.FinalActivity.extra.everydayLife;

public class Student extends Person implements everydayLife {

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
        String introduction = String.format("I study at %s", schoolName);
        return introduction;
    }

    @Override
    public String doWork() {
        String result = String.format("%s goes to the lectures at %s",
                this.getName(),
                schoolName);
        return result;
    }

    public String doRest() {
        String result = this.getName() + ' ' + everydayLife.super.doRest(personalHobby);
        return result;
    }
}
