package sef.module6.activity;

//TODO: Dog class should implement Animal
public class Dog implements Animal{

    //TODO: Create method animalSound() and its implementation should print out string "Dog says: 'Wuf Wuf'!"
    @Override
    public void animalSound() {
        System.out.println("Dog says: 'Wuf Wuf'!");
    }

    //TODO: Create method sleep() and its implementation should print out string "Dog is sleeping!"
    @Override
    public void sleep() {
        System.out.println("Dog is sleeping!");
    }

}
