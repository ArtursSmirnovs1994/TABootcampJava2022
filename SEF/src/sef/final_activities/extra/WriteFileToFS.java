package sef.final_activities.extra;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

public class WriteFileToFS {

    public static void main(String[] args) {

        Employee[] employees = {
                new Employee("John", "Smith", 35, "dev", "Comp", 1200),
                new Employee("Marta", "Smith", 29, "tester", "Comp", 1200),
                new Employee("Erika", "Holmes", 22, "engineer", "comp", 2000),
                new Employee("Lina", "Reine", 44, "director", "comp", 9000),
                new Employee("Sergey", "Propper", 55, "worker", "comp", 500),
                new Employee("Samantha", "Miln", 19, "secretary", "comp", 1700),
                new Employee("John", "Krombacher", 58, "driver", "comp", 1200),
                new Employee("Michael", "Scott", 46, "manager", "comp", 3000),
                new Employee("Anna", "Mann", 28, "dev", "comp", 1200),
                new Employee("Anna", "Heine", 35, "manager", "comp", 3000)
        };

        String outputFileName = "employees.txt";

        String output = Arrays.toString(employees);

        // after execution, a text file with employees info should appear at the root of project
        // it is safe to delete it
        try (PrintWriter writer = new PrintWriter(outputFileName)) {
            writer.print(output);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
