package sef.FinalActivity.FirstActivity;

public class StudentActivity {
    public static void main(String[] args) {
        //Create Student
        try {
            Student stud = new Student("Jana JZ", 39, "RTU");
            stud.Introduction();
        }
        catch (PersonCustomException pce){
            System.out.println("Can't create Student: " + pce.getMessage());
        }
    }
}
