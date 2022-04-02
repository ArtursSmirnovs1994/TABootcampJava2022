package sef.finalActivity.firstActivity;

public class Person {

    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws CustomExceptionFirst {

        if (name.matches("^[a-zA-Z]*$")) {
            this.name = name;
        } else {
            throw new CustomExceptionFirst();
        }


    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String introduceMe() {
        return ("My name is " + name + " and I am " + age + " years old");

    }



//   Didn't know how to "unit test" System.out.println, so changed to return String
//
//    public void introduceMe() {
//        System.out.println("My name is " + name + " and I am " + age + " years old");
//
//    }


}
