package sef.module6.activity;

import sef.module6.sample.interfaceSample.Strategy;

//TODO: Cat class should implement Animal
public class Cat implements Animal  {

    //TODO: Create method animalSound() and its implementation should print out string "Cat says: 'Meow Meow'!"
    public void animalSound(){
        System.out.print("Cat says 'Meow Meow'");
    }

    //TODO: Create method sleep() and its implementation should print out string "Cat is sleeping!"
    public void sleep(){
        System.out.print("Cat is sleeping!");
    }
}
