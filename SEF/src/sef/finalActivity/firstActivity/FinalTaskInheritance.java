package sef.finalActivity.firstActivity;

//This was made for me(Lauma) to check if all works when put together, not from presentation final tasks

public class FinalTaskInheritance {

    public static void main(String arg[]) throws CustomExceptionFirst {

        Person pepa = new Person();
        pepa.setName("Pepa");
        pepa.setAge(8);


        Employee ema = new Employee();
        ema.setName("Emma");
        ema.setAge(52);
        ema.setCompany("The New Company");
        ema.setJobTitle("The Boss");
        ema.setSalary(90000);

        Students su = new Students();
        su.setSchoolName("Best of the Best");
        su.setName("Bob");
        su.setAge(19);

        System.out.println("-----------------------------");
        System.out.println(pepa.introduceMe());

        System.out.println("-----------------------------");
        System.out.println(ema.introduceMe());

        System.out.println("-----------------------------");
        System.out.println(su.introduceMe());

    }

}
