package sef.finalActivity.firstActivity;

import sef.module6.activity.Animal;

public class Students extends Person implements Humanity {

    String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String introduceMe() {
        return ("My name is " + name + " and I study in university " + schoolName);

    }



}