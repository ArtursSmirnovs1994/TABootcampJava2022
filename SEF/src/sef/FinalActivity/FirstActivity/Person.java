package sef.FinalActivity.FirstActivity;

public class Person {

    private String name;
    private int age;


    public Person(){
        this.name="Unknown";
        this.age = 0;
    }

       public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        char[]ch=name.toCharArray();
        for(char c: ch) {
            if (Character.isDigit(c)) {
                System.out.println("Not possibele to write in numbers");
            }
        }this.name = name;
          }


    public int getAge() {return age; }


    public void setAge(int age) { this.age = age; }

    public void announce(){

        System.out.println("My name is "+getName()+"i am" + getAge()+"years old");
    }

}