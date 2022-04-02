package sef.FinalActivity.FirstActivity;

public class EmployeeTest {
    public static void main(String[] args) throws CustomizedException {

        Employee firstEmployee = new Employee();
        firstEmployee.setSalary(7000);
        firstEmployee.setJobTitle("Manager");
        firstEmployee.setCompany("DHL");
        firstEmployee.setAge(32);
        firstEmployee.setName("Anda Liepina");

        Employee secondEmployee = new Employee();
        secondEmployee.setSalary(2000);
        secondEmployee.setJobTitle("Seller");
        secondEmployee.setCompany("Maxima");
        secondEmployee.setAge(45);
        secondEmployee.setName("Anna Berzina");

        Employee thirdEmployee = new Employee();
        thirdEmployee.setSalary(3000);
        thirdEmployee.setJobTitle("Driver");
        thirdEmployee.setCompany("Rimi");
        thirdEmployee.setAge(27);
        thirdEmployee.setName("Janis Zarins");

        Employee forthEmployee = new Employee();
        forthEmployee.setSalary(4500);
        forthEmployee.setJobTitle("Writer");
        forthEmployee.setCompany("Eksmo");
        forthEmployee.setAge(35);
        forthEmployee.setName("Juris Klavins");

        Employee[] ArrEmp = new Employee[]{firstEmployee, secondEmployee, thirdEmployee, forthEmployee};

//Sorting array by Salary
        for (int i = ArrEmp.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (ArrEmp[j].getSalary() < ArrEmp[j + 1].getSalary()) {
                    Employee tmp = ArrEmp[j];
                    ArrEmp[j] = ArrEmp[j + 1];
                    ArrEmp[j + 1] = tmp;
                }
            }
        }
        Printing(ArrEmp);
    }

    public static void Printing(Employee ArrEmp[]) {
        for (int a = 0; a < ArrEmp.length; a++) {
            System.out.println("-----------------------------");
            System.out.println("Employee's Name is   : " + ArrEmp[a].getName());
            System.out.println("Employee's Age is    : " + ArrEmp[a].getAge());
            System.out.println("Employee's Company is  : " + ArrEmp[a].getCompany());
            System.out.println("Employee's Title is  : " + ArrEmp[a].getJobTitle());
            System.out.println("Employee's Salary is : " + ArrEmp[a].getSalary());
        }
    }
}


