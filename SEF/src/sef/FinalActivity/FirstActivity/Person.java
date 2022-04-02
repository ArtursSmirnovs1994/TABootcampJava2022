package sef.FinalActivity.FirstActivity;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Person {


    private String name;
    private int age;

   //getter for name

    public String getName() {
        return name;
    }

    //Setter for name. Validation, only alphabeticals allowed

    public void setName(String name) {
        if (name.matches("[a-zA-Z]+(\\s+[a-zA-Z]+)*")) {
            this.name = name;
        }else {
        throw new IllegalArgumentException("Name can contain only letters");

    }
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //method to create introduction with name and age

    public String announcePerson() {
        return ("My name is: " +name +" and I am " +age + " years old");

    }
  }
