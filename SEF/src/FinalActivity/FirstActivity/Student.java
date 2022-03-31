package FinalActivity.FirstActivity;

public class Student extends Person {
    private String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I study at university " + getSchoolName());
    }

    public static void main(String[] args) throws AgeFormatException, NameFormatException {
        Student hermione = new Student();
        hermione.setAge(11);
        hermione.setName("Hermione Granger");
        hermione.setSchoolName("Hogwarts");
        hermione.introduce();

    }
}


