package sef.final_activities.first_activity;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new PersonParametersException("Name is empty or blank");
        }

        // Excuse me for using regexp here, it's hand-made, so it can be far from ideal
        // I could write a separate method containsDigit(), but regexp looks more appropriate
        if (name.matches(".*?\\d.*?")) {
            throw new PersonParametersException("Name contains digit(s)");
        }

        this.name = name.trim(); // cut leading and trailing spaces
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // early exit if age is out of bounds
        if (age < 0 || age > 150) {
            throw new PersonParametersException("Invalid age value");
        }

        this.age = age;
    }

    public void introduce() {
        System.out.printf("My name is %s and I am %d years old\n", getName(), getAge());
    }
}
