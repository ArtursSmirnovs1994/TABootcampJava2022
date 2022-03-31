package sef.FinalActivity.FirstActivity;

public class Person  {
    String name;
    int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws PersonCustomException {
       if(name.matches(".*\\d.*")) {
            throw new PersonCustomException();
        }
        this.name = name;

    }
    public String introducePerson()
    {

        return "My Name is "+name+" and i am "+age ;
    }
}


