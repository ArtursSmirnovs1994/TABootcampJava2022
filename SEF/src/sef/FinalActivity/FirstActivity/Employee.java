package sef.FinalActivity.FirstActivity;

import sef.FinalActivity.extra.everydayLife;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Employee extends Person implements everydayLife {

    public Employee(String jobTitle, String company) {
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = assignSalary();
    }

    public Employee(String name, int age, String jobTitle, String company) {
        super(name, age);
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = assignSalary();

    }

    private String jobTitle;
    private String company;

    int salary;

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String introduceYourself() {
        String introduction = super.introduceYourself();
        introduction += String.format("\nI work as %s at %s. My salary is %d", jobTitle, company, salary);
        return introduction;
    }

    private int assignSalary() {
        int min = 15;
        int max = 50;
        int newSalary = new Random().nextInt(max - min) + min;
        newSalary *= 100;
        return newSalary;
    }

    public String getFirstName() {
        return getName().substring(0, getName().indexOf(' '));
    }

    public String getSecondName() {
        return getName().substring(getName().indexOf(' '));
    }

        @Override
        public String doWork() {
            String result =  String.format(
                    "%s goes to %s to do %s stuff",
                    getName(),
                    getCompany(),
                    getJobTitle()
            );
            return result;
        }

    public String doRest() {
        String result = this.getName() + ' ' + everydayLife.super.doRest(personalHobby);
        return result;
    }

    public static class salaryComparator implements Comparator<Employee> {
        public int compare(Employee emp1, Employee emp2) {
            int salary1 = emp1.getSalary();
            int salary2 = emp2.getSalary();
            return salary2 - salary1;
        }
    }

    public static class firstNameComparator implements Comparator<Employee> {
        public int compare(Employee emp1, Employee emp2) {
            String firstName1 = emp1.getFirstName();
            String firstName2 = emp2.getFirstName();
            return firstName1.compareTo(firstName2);
        }
    }

    public static class secondNameComparator implements Comparator<Employee> {
        public int compare(Employee emp1, Employee emp2) {
            String secondName1 = emp1.getSecondName();
            String secondName2 = emp2.getSecondName();
            return secondName1.compareTo(secondName2);
        }
    }

    @Override
    public String toString() {
        return String.format("%s [%s, %s, %s]\n", this.getName(), jobTitle, company, salary);
    }

    public static void printToFile(Employee[] employees) throws IOException {
        Scanner c = new Scanner(System.in);
        System.out.printf("Enter the filename to save to in the current directory%n> ");
//        String input = c.nextLine().trim();
        String input = "hello.txt";
        System.out.println(input);
        char separator;
        if (System.getProperty("os.name").contains("Windows") || System.getProperty("os.name").contains("windows")
        ) {
            separator = '\\';
        } else {
            separator = '/';
        }
        int separatorIndex = input.lastIndexOf(separator);
        if (separatorIndex == -1) separatorIndex = 0;
        input = input.substring(
                separatorIndex
        );
        if (input.length() == 0) {
            System.out.println("Empty filename");
            return;
        }
        BufferedWriter outputFile = new BufferedWriter(new FileWriter(input));
        for (Employee e : employees) {
            outputFile.write(e.toString());
        }
        outputFile.close();
    }
}
