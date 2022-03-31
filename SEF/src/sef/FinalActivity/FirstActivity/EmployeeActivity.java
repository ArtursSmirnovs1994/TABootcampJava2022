package sef.FinalActivity.FirstActivity;

public class EmployeeActivity {
    public static void main(String[] args) {
        //Create Employee
        try {
            Employee empl = new Employee("Jana", 39, "Editor", "Radio", 1500);
            empl.Introduction();
        }
        catch (PersonCustomException pce){
            System.out.println("Can't create Employee: " + pce.getMessage());
        }
    }
}
