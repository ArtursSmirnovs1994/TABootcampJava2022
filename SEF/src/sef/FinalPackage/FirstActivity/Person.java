package sef.FinalPackage.FirstActivity;

public class Person {

    private String name;
    private int age;


    public Person() {
        this.name = "default";
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
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

    public String announce() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("My name is " + name+ " and I am " + age + " years old.");
        return buffer.toString();

    }




    // failed to make "validation" from task 1.4






}
