package sef.finalactivity.extras;

import java.io.PrintWriter;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

//Extra01 and 05


public class extra01 {
    public static void main(String[] args) {



        Scanner name = new Scanner(System.in);
        Scanner sal = new Scanner(System.in);
        Scanner date = new Scanner(System.in);
        Scanner month = new Scanner(System.in);
        Scanner year = new Scanner(System.in);

        Scanner Sname = new Scanner(System.in);
        Scanner Sstudies = new Scanner(System.in);




        System.out.print("enter name: ");
        String names = name.nextLine();

        System.out.println("enter salary");

        int sals = sal.nextInt();

        System.out.println("enter date");

        int dates = date.nextInt();

        System.out.println("enter month");

        int months =month.nextInt();

        System.out.println("enter year");

        int years =year.nextInt();


        System.out.print("Enter name: ");
        String Studentname = Sname.nextLine();

        System.out.print("Enter studies: ");
        String Studentstudies = Sstudies.nextLine();




        Person[] people = new Person[2];

        people[0] = new Employee(names.toString(), sals, dates, months, years);

        people[1] = new Student(Studentname , Studentstudies);



        for (Person p : people) {


            System.out.println(p.getName() + ", " + p.getDescription());

        }
    }
}

abstract class Person {

    private String Pname;

    public Person(String name) {

        Pname = name;
    }

    public abstract String getDescription();

    public String getName() {

        return Pname;
    }
}

class Employee extends Person {

    private double salary;
    private Date date;

    public Employee(String n, double s, int day, int month, int year) {

        super(n);

        salary = s;

        GregorianCalendar calendar = new GregorianCalendar( day-22, month - 5, year - 2022);

        date = calendar.getTime();
    }

    public double getSalary() {

        return salary;
    }

    public Date getHireDay() {

        return date;
    }

    @Override
    public String getDescription() {

        return String.format("salary of $%.2f", salary);
    }
}

class Student extends Person {

    private String major;

    public Student(String n, String m) {


        super(n);

        major = m;
    }

    @Override
    public String getDescription() {


        return "a student of " + major;
    }

}

