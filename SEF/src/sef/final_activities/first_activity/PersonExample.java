package sef.final_activities.first_activity;

public class PersonExample {

    public static void main(String[] args) {

        Person eve = new Person("Eve", 18);

        eve.introduce();

        eve.setAge(20);

        eve.introduce();

        eve.setName("Eveline");

        eve.introduce();

        Employee sergey = new Employee("Sergey", 48, "Developer", "Accenture", 1200);

        sergey.introduce();

        Person john = new Employee("John", 22, "Manager", "Facebook", 15_000);

        john.introduce();

        john.setAge(25);

        Person instagramDirector = new Employee(john, "Director", "Instagram", 100_000);

        instagramDirector.introduce();

        Student maksims = new Student("Maksims", 19, "Accenture School");

        maksims.introduce();

        Person vera = new Student("Vera", 20, "MIT");

        vera.setAge(21);

        vera.introduce();

    }

}
