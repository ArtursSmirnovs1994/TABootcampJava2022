package sef.finalActivity.firstActivity;

import java.lang.reflect.Array;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
       char[] charArray = name.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isDigit(charArray[i])) {
                throw new IllegalArgumentException("Name can't consist numbers");
            }
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void personIntroduction( String name, int age) {
        System.out.println("My name is " + name + " and I am " + age + " years old");

    }



}
