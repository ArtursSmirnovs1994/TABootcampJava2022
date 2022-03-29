package sef.module6.activity;

// Cat class should implement Animal
public class Cat implements Animal {

    // Create method animalSound() and its implementation should print out string "Cat says: 'Meow Meow'!"
    @Override
    public void animalSound() {
        System.out.println("Cat says: 'Meow Meow'!");
    }

    // Create method sleep() and its implementation should print out string "Cat is sleeping!"
    @Override
    public void sleep() {
        System.out.println("Cat is sleeping!");
    }
}
