package sef.module6.activity;

public class Dog implements Animal{
    @Override
    public void animalSound() {
        System.out.println("Dog says: 'Wuf Wuf'!");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping!");
    }
}
