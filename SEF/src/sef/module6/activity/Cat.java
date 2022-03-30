package sef.module6.activity;

public class Cat implements Animal {
    @Override
    public void animalSound() {
        System.out.println("Cat says: 'Meow Meow'!");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }

}
