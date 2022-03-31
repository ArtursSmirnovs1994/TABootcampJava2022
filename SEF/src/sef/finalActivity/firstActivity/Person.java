package sef.finalActivity.firstActivity;

import java.util.regex.Pattern;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws InvalidPersonNameException {
        validateName(name);

        this.name = name;
        this.age = age;
    }

    public Person() {
        name = "";
        age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidPersonNameException {
        validateName(name);
        this.name = name;
    }

    static void validateName(String name) throws InvalidPersonNameException {
        if (name.matches(".*\\d.*")) {
            throw new InvalidPersonNameException("Do not use numbers in the name, name '" + name + "' was given.");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String introduction() {
        return "My name is " + name + " and I am " + age + " years old.";
    }
}
