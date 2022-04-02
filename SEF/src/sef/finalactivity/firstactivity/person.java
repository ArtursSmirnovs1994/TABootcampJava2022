package sef.finalactivity.firstactivity;

public class person   {

    public  boolean Employee(String Name, int age,String role,String Company, int salary1,String school1) {


        Persondetail Details = new Persondetail();

        employeedetail Employedetail = new employeedetail();

        studentdetail Studentdetail = new studentdetail();


        Details.setName(Name);
        Details.setAge(age);
        Employedetail.setJobtype(role);
        Employedetail.setCompany(Company);
        Employedetail.setSalary(salary1);
        Studentdetail.setSchoolname(school1);






        String personname = Details.getName();
        int personage = Details.getAge();
        String jobtype = Employedetail.getJobtype();
        String company = Employedetail.getCompany();
        int salary = Employedetail.getSalary();
        String school = Studentdetail.getSchoolname();

        String str = personname;
        int sal = salary;
        boolean result = str.matches("[a-zA-Z]+");


        if (result == true){
            if (sal > 0 && sal< 100000 ){
                System.out.println("My name is "+ personname +" and I'm "+ personage  +" years old"+" I work as "+ jobtype +" in "+ company + " I earn "+ salary+ " I have studied in "+school);
            }
            else {
                System.out.println("Salary can not be less than 1 and grater than 100000");
            }

        }
        else {
            System.out.println(Details.getName()+" is not a valid name, Please try with a valid name");
        }

        return result;

    }


}