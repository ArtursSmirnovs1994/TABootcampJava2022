package sef.module6.activity;

public class Mammal {

    private Animal myAnimal;
    private String name;


    public Mammal(String flexy) {
        this.name = flexy;
    }


    //TODO create constructor for Mammal with parameter name



    public void setAnimal(Animal animal) {
        myAnimal = animal;
    }

    public void animalIsSleeping() {
        System.out.println("Animal with name: " + name+ " is ...");
        System.out.println("Animal with name: " + myAnimal+ " is ..." );
        //TODO: write code so that Animal sleep implementation is used
        myAnimal.sleep();
    }

    public void animalIsSpeaking() {
        System.out.println("Animal with name: " + name+ " is ...");
       //TODO: write code so that Animal animalSound implementation is used
myAnimal.animalSound();
    }
}
