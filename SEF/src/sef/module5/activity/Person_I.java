package sef.module5.activity;


public class Person_I {

    //Attributes
    private String name;
    private int age;

    //Behavior
    // write default constructor. Print 'I'm Person_I constructor'
    public Person_I() {
        System.out.println("I'm Person_I constructor");
    }

    // Write parameterized constructor with variables name and age
    public Person_I(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // write getter for String name
    public String getName() {
        return name;
    }


    // write setter for String name
    public void setName(String name) {
        this.name = name;
    }


    // write getter for int age
    public int getAge() {
        return age;
    }


    // write setter for int age
    public void setAge(int age) {
        this.age = age;
    }

}
