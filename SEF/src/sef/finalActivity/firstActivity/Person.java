package sef.finalActivity.firstActivity;

public class Person {
    public static void main(String[] args) {
     Person Employee = new Person("Ivan", 33);
     Employee.introduction();
    }

    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void introduction() {
        System.out.println("My name is " + this.name + " and I am " + this.age + " years old");
    }
    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;

    }
}
