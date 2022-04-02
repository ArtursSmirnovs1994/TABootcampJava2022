package sef.module6.activity;

//TODO: Cat class should implement Animal
public class Cat implements Animal {
    @Override
    public void animalSound() {
        System.out.println("Cat says 'Meow Meow..!\n");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping..!\n");
    }


    //TODO: Create method animalSound() and its implementation should print out string "Cat says: 'Meow Meow'!"


    //TODO: Create method sleep() and its implementation should print out string "Cat is sleeping!"

}
