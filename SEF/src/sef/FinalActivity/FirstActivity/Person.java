package sef.FinalActivity.FirstActivity;

public class Person {

    //Attributes
    private String name;
    private int age;

    //Getter for String name
    public String getName() {
        return name;
    }

    //Setter for String name
    public void setName(String name) throws CustomizedException {
        if (name.matches("[ a-zA-Z]+")) {
            this.name = name;
        } else
            throw new CustomizedException();
    }

    //Getter for int age
    public int getAge() {
        return age;
    }

    //Setter for int age
    public void setAge(int age) {
        this.age = age;
    }

    public String introduction() {
        String message = "My name is " + this.name + " and I am " + this.age + " years old";
        return message;
    }
}
