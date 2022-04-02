package sef.FinalActivity.ExtraActivity;

import sef.FinalActivity.FirstActivity.Employee;
import sef.FinalActivity.FirstActivity.PersonCustomException;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class SaveEmployeesToTXT {
    public static void main(String[] args) {
        ArrayList<Employee> empl  = new ArrayList<Employee>();

        //Create Employees
        try {
            empl.add(new Employee("Jana", 39, "Editor", "Radio", 1500));
            empl.add(new Employee("Maris", 27, "Engineer", "Radio", 1000));
            empl.add(new Employee("Antuan", 45, "Manager", "Radio", 2500));
            empl.add(new Employee("Jose", 23, "Admin", "Radio", 500));
            empl.add(new Employee("Frank", 29, "Office admin", "Radio", 700));
        }
        catch (PersonCustomException pce){
            System.out.println("Can't create Employee: " + pce.getMessage());
        }

        SaveEmployeesToTXT obj = new SaveEmployeesToTXT();
        obj.saveToFile("c:\\temp\\Array.txt", empl);
    }


    void saveToFile(String fileName, ArrayList<Employee> empl){
        String IntroLine;
        System.out.println("Try to save info to file: " + fileName);

        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream(fileName));
            for (int i=0; i < empl.size(); i++){
                IntroLine = "Intro: My name is " + empl.get(i).getName() + " and I am " + empl.get(i).getAge() + " years old. I work as " + empl.get(i).getJobTitle() + " in " + empl.get(i).getCompany() + ", my salary is " + empl.get(i).getSalary();
                pw.write(IntroLine + "\n");
            }
            pw.close();
        } catch (Exception e){
            System.out.println("Exception during writing to File: " + e.getMessage());
        }
    }
}
