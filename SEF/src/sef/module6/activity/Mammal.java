package sef.module6.activity;

public class Mammal {

    private Animal myAnimal;
    private String name;

    public Mammal(String name) {
        this.name = name;
    }

    public void setAnimal(Animal animal) {
        myAnimal = animal;
    }

    public void animalIsSleeping() {
        System.out.println("Animal with name: " + name+ " is ...");
        myAnimal.sleep();

    }

    public void animalIsSpeaking() {
        System.out.println("Animal with name: " + name+ " is ...");
        myAnimal.animalSound();

    }
}
