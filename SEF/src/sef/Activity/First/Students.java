package sef.Activity.First;

public class Students extends Person {

    //3.1) Create attribute schoolName
    //3.2) Create getters and setters for attribute
    //3.2) Students class should extend to Person class
    //3.2 Add method for introduce of person -> "I am study in university <schoolName>"

    //Attributes
    private String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void introduction() {
        System.out.printf("I am study in university: %s\n", schoolName);
    }

    public static void main(String[] args) throws InvalidNameException {

        Students st1 = new Students();
        st1.setName("Elena");
        st1.setAge(33);
        st1.setSchoolName("Accenture bootcamp");
        st1.introduction();

        Students st2 = new Students();
        st2.setName("Demo1");
        st2.setAge(33);
        st2.setSchoolName("Accenture bootcamp");
        st2.introduction();
    }
}
