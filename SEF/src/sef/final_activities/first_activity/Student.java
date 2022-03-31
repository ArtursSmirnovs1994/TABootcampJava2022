package sef.final_activities.first_activity;

public class Student extends Person {

    private String schoolName;

    public Student(String name, int age, String schoolName) {
        super(name, age);
        setSchoolName(schoolName);
    }

    public Student(Person person, String schoolName) {
        this(person.getName(), person.getAge(), schoolName);
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public void introduce() {
        System.out.println("I am study at university " + getSchoolName());
    }
}
