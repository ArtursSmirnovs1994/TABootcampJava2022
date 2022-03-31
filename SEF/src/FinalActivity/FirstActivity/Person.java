package FinalActivity.FirstActivity;

public class Person {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeFormatException {
        if (age <= 0) {
            throw new AgeFormatException();
        }
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) throws NameFormatException {
        if (name.matches(".*\\d.*")) {
            throw new NameFormatException();
        }
        this.name = name;
    }

    public void introduce() {
        System.out.println("My name is " + getName() + " and I am " + getAge() + " years old.");
    }

}




