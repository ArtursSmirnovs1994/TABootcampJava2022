package sef.FinalActivity.FirstActivity;

public class Person {
    //Attributes
    private String name;
    private int age;

    //Behavior
    //TODO: write default constructor
    public Person(){
        System.out.println("I'm Person's Default Constructor");
    }

    //TODO: Write parameterized constructor with variables name and age
    public Person(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("I'm Person's Constructor, name: " + name + ", age: " + age);
    }


    //TODO: write getter for String name
    public String getName() {
        return name;
    }

    //TODO: write setter for String name
    public void setName(String name) throws PersonCustomException {
        System.out.println("Try to set name: " + name);
        if (!name.matches("[a-zA-Z ]+"))
            throw new PersonCustomException("Name is not correct, should be only letters a-z/A-Z");
        else
            this.name = name;
    }

    //TODO: write getter for int age
    public int getAge() {
        return age;
    }

    //TODO: write setter for int age
    public void setAge(int age) {
        this.age = age;
    }

    public void Introduction(){
        System.out.println("Intro: My name is " + name + " and I am " + age + " years old");
    }
}
