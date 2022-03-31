package sef.FinalActivity.FirstActivity;

public class Employee_D extends Person_D {

        private String jobTitle;
        private String company;
        private int salary; // Not required in task 2) but needed in task 4.2) (that should be 4.3) :) )
        // In real life I would ask a responsible person about the requirements
        // but in this case I will assume that salary should actually be here.

        public Employee_D(){
            this.jobTitle = "Tester";
            this.company = "Accenture";
            this.salary = 1000;
        }

        public Employee_D(String jobTitle, String company, int salary){
            this.jobTitle = jobTitle;
            this.company = company;
            this.salary = salary;
        }

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
            if (salary < 0) {
                System.out.println("Salary cannot be negative.");
            } else {
                this.salary = salary;
            }
        }

        void introEmployee (){
            System.out.println("My name is " + getName() + " and I am " + getAge() + " years old.\nI work as " +
                    getJobTitle() + " in " + getCompany());
        }

}
