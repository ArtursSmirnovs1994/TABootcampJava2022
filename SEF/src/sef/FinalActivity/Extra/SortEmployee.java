package sef.FinalActivity.Extra;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
;

    public class SortEmployee
    {
        public static void main(String[] args)
        {

            Employee[] employees = {
                    new Employee("Jacob", "Lidiya"),
                    new Employee("Athira", "Greeny"),
                    new Employee("Mebson", "Black"),
                    new Employee("K", "Yellow"),
                    new Employee("L", "Pink"),
                    new Employee("D", "Blue"),
                    new Employee("W", "Brown")
            };

            // get List view of the Employees
            List<Employee> list = Arrays.asList(employees);

            // display all Employees
            System.out.println("Complete Employee list:");
            list.stream().forEach(System.out::println);


            // Functions for getting first and last names from an Employee
            Function<Employee, String> byFirstName = Employee::getFirstName;
            Function<Employee, String> byLastName = Employee::getLastName;

            // Comparator for comparing Employees by first name then last name
            Comparator<Employee> lastThenFirst =Comparator.comparing(byLastName).thenComparing(byFirstName);

            // sort employees by last name, then first name
            System.out.println(
                    "Employees in ascending order by last name then first:");
            list.stream().sorted(lastThenFirst).forEach(System.out::println);
        }
    }
