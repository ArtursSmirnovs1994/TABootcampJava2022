package sef.finalActivity.firstActivity;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == "Ivan3") {
            throw new IllegalArgumentException("Invalid name");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String introducePerson() {
        return ("My name is " + name + "and I am " + age + "years old");
    }

    }

