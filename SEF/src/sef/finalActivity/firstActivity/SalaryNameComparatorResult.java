package sef.finalActivity.firstActivity;

import java.util.Arrays;

public class SalaryNameComparatorResult {

        public static void main(String args[]) {


                Employee employee[] = new Employee[5];

                employee[0] = new Employee();
                employee[0].setName("Alex");
                employee[0].setAge(30);
                employee[0].setSalary(50000);

                employee[1] = new Employee();
                employee[1].setName("Fiona");
                employee[1].setAge(29);
                employee[1].setSalary(40000);

                employee[2] = new Employee();
                employee[2].setName("Andris");
                employee[2].setAge(39);
                employee[2].setSalary(90000);

                employee[3] = new Employee();
                employee[3].setName("Berta");
                employee[3].setAge(35);
                employee[3].setSalary(75000);

                employee[4] = new Employee();
                employee[4].setName("Fred");
                employee[4].setAge(32);
                employee[4].setSalary(70000);

                System.out.println("Order of employee before sorting is");

                for (int i = 0; i < employee.length; i++) {
                        System.out.println("Employee " + (i + 1) + " name :: " + employee[i].getName() + ", Age :: " + employee[i].getAge());
                }


                Arrays.sort(employee, new SalaryComparator());
                System.out.println("\n\nOrder of employee after sorting by employee salary is");
                for (int i = 0; i < employee.length; i++) {
                        System.out.println("Employee " + (i + 1) + " name :: " + employee[i].getName() + ", Age :: " + employee[i].getAge() + ", Salary :: " + employee[i].getSalary());
                                }
                Arrays.sort(employee, new NameComparator());
                System.out.println("\n\nOrder of employee after sorting by employee name is");
                for (int i = 0; i < employee.length; i++) {
                        System.out.println("Employee " + (i + 1) + " name :: " + employee[i].getName() + ", Age :: " + employee[i].getAge() + ", Salary :: " + employee[i].getSalary());
                }
        }
}



