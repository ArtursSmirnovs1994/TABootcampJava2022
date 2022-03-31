package sef.FinalActivity.FirstActivity;


public class Person {

    public Person() {
    }

    public Person(String name, int age) {
        this.name = validateName(name);
        this.age = age;
    }

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = validateName(name);
    }

    private String validateName(String input) throws InvalidNameException {
        String trimmed = input.trim();
        if (trimmed.length() == 0) {throw new InvalidNameException("Name cannot be blank"); }
//        if (trimmed.length() < 2) {throw new InvalidNameException("Name is too short"); }
        if (
                nameHasNumbers(input)
                        || trimmed.matches("\\d")
        ) { throw new InvalidNameException("Name cannot contain numbers");  }
        return trimmed;
    }

    boolean nameHasNumbers(String name) {
        String numbers = "1234567890";
        for (char c : name.toCharArray()) {
            for (char d : numbers.toCharArray()) {
                if (c == d) return true;
            }
        }
        return false;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String introduceYourself() {
        return String.format("My name is %s and I am %d years old", name, age);
    }
}
