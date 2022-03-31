package sef.finalActivity.firstActivity;

public class Student extends Person {                   //3.3 students do be extending

    public Student(int age, String name) {              // once again inteliij generated this and i let him
        super(age, name);
    }

    public String schoolName;                           //3.1 one more attribute

    public String getSchoolName() {                     //3.2 right click generate getters and setters
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void studentIntro (){                        //3.4 student intro
        System.out.println("I am studying in university " + schoolName);
    }




}
