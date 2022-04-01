package sef.finalActivity.firstActivity;


import java.util.Arrays;

public class EmployeeTest {

    public static void main(String arg[]) throws CustomExceptionFirst {

        Employee employee[] = new Employee[4];

        employee[0] = new Employee();
        employee[0].setSalary(50000.50);
        employee[0].setName("Alnis");

        employee[1] = new Employee();
        employee[1].setSalary(90000);
        employee[1].setName("Zuzanna");

        employee[2] = new Employee();
        employee[2].setSalary(30000);
        employee[2].setName("Rita");

        employee[3] = new Employee();
        employee[3].setSalary(5500.60);
        employee[3].setName("Biruta");


        Arrays.sort(employee, new SalaryComparator());
        System.out.println("\n\nOrder of employee after sorting by employee salary is");

        for(int i=0; i < employee.length; i++){
            System.out.println( "Employee " + (i+1) + " name :: " + employee[i].getName() + ", Salary :: " + employee[i].getSalary());
        }

//        Employee one = new Employee();
//        one.setName("Alnis");
//        one.setSalary(50000.50);
//
//        Employee two = new Employee();
//        two.setName("Zuzanna");
//        two.setSalary(90000);
//
//        Employee three = new Employee();
//        three.setName("Rita");
//        three.setSalary(30000);
//
//        Employee four = new Employee();
//        four.setName("Biruta");
//        four.setSalary(5500.60);


    }
}