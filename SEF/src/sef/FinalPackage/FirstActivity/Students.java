package sef.FinalPackage.FirstActivity;

public class Students extends Person {


    private String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String introductionOfStudents() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("I study in the " + schoolName + " university.");
        return buffer.toString();

    }


    public static void main(String[] args) {
        Students s = new Students();
        s.setSchoolName("Oxford");

        System.out.println("I study in the " + s.getSchoolName() + " university.");

    }


}
