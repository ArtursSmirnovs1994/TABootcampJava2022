package sef.FinalActivity.FirstActivity;

public class Student extends Person{
    //Attributes
    private String schoolName;

    //Behavior
    //TODO: write default constructor
    public Student(){
        System.out.println("I'm Student's Default Constructor");
    }

    //TODO: Write parameterized constructor
    public Student(String name, int age, String schoolName) throws PersonCustomException{
        this.setName(name);
        this.setAge(age);
        this.schoolName=schoolName;
        System.out.println("I'm Student's Constructor, name: " + name + ", age: " + age);
        System.out.println("School: " + schoolName);
    }

    //TODO: write getter for schoolName
    public String getSchoolName() {
        return schoolName;
    }

    //TODO: write setter for schoolName
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void Introduction(){
        System.out.println("Intro: My name is " + this.getName() + " and I am " + this.getAge() + " years old");
        System.out.println("I study in " + schoolName);
    }
}
