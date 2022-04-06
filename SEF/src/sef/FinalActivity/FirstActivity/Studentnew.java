package sef.FinalActivity.FirstActivity;

public class Studentnew extends Person {

    private String schoolName;
    public  Studentnew(){
        this.schoolName="empty";
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void introduceStudentnew() {
        super.announce();
        System.out.println("I am studdy in university " + getSchoolName());
     }
}
