package sef.finalActivity.firstActivity;

public class Person {
    public static void main(String[] args) {

    }

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {                  //1.4.!!!!!!!!!!!!!!!???????
            this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String introduce() {
        String statement = "My name is " + name + " and i am " + age + " years old";
        return statement;
    }
}
