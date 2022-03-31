package sef.FinalActivity.FirstActivity;

public class PersonActivity {
    public static void main(String[] args) {
        //Create Person
        Person p = new Person("Jana Jermakova-Zaikovska", 39);
        p.Introduction();

        //Try to Set name and get exception
        try{
            p.setName("Jana JZ");
            p.Introduction();
            p.setName("Jana 123 Jermakova-Zaikovska");
            p.Introduction();
        } catch (PersonCustomException pce){
            System.out.println("Some Person error occurred: " + pce.getMessage());
        }
        finally {
            System.out.println("After setName:");
            p.Introduction();
        }
    }
}
