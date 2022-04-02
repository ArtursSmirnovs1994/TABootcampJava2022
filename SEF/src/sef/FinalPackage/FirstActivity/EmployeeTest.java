package sef.FinalPackage.FirstActivity;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;


public class EmployeeTest extends Employee {

    public static void main(String[] args) {
        Employee Employee_1 = new Employee();
        Employee Employee_2 = new Employee();
        Employee Employee_3 = new Employee();
        Employee Employee_4 = new Employee();

        Employee_2.setName("David");
        Employee_2.setAge(44);
        Employee_2.setSalary(1100);

        Employee_3.setName("Anna");
        Employee_3.setAge(22);
        Employee_3.setSalary(99900);

        Employee_4.setName("Tom");
        Employee_4.setAge(33);
        Employee_4.setSalary(220);

        Employee_1.setName("Sara");
        Employee_1.setAge(11);
        Employee_1.setSalary(88);

        double[] salaries = {Employee_2.getSalary(), Employee_3.getSalary(), Employee_4.getSalary(), Employee_1.getSalary()};

        Arrays.sort(salaries);

        for(int i=salaries.length-1 ; i>=0 ; i--){
            System.out.println(salaries[i]);
        }







    }



}
