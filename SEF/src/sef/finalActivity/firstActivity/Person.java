package sef.finalActivity.firstActivity;

import sef.module7.sample.CustomException;

public class Person {

    public int age;                             //1.1 create attributes
    public String name;

    public Person(int age, String name) {
    }

    public Person() {}                          //when creating employee this was asked to be created

    public String getName() {                   //1.2 generate getters and setters
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void intro() {                       //1.3 create intro method
        System.out.println("My name is " + name + "and i am " + age + "years old.");
    }
    //TODO 1.4 add validation - name cannot contain/be number.

//    public static void setName(String name) throws CustomException {
//        char[] chars = name.toCharArray();
//        for (char c : chars) {
//            if (Character.isDigit(c)) {
//                throw new CustomException();
//            }
//        }
//
//    }
}
