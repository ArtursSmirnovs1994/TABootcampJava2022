package sef.Activity.First;

public class Person {

    // 1.2) Create setters and getters for attributes
    // 1.3) Create a method for introduction of person: "My name is <name> and i am <age> years old“
    // 1.4) Add a validation for setName that it is not possible to set a name with numbers, f.e. setName(“Ivan3”)
    //  should throw a customized exception.

    //Attributes
    protected String name;
    protected int age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidNameException {
        if (containsDigit(name)) {
            throw new InvalidNameException();
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void introduction() {
        System.out.printf("My Name is: %s and I am %d years old.\n", name, age);
    }

    private boolean containsDigit(String s) {
        boolean containsDigit = false;
        if (s != null && !s.isEmpty()) {
            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    containsDigit = true;
                    break;
                }
            }
        }
        return containsDigit;
    }

    public static void main(String[] args) throws InvalidNameException {
        Person person1 = new Person();
        person1.setName("Elena");
        person1.setAge(33);
        person1.introduction();
        Person person = new Person();
        person.setAge(33);
        person.setName("dfsfd334df");
        person.introduction();

    }
}
