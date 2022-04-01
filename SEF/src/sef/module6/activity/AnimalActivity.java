package sef.module6.activity;

import sef.module6.sample.interfaceSample.General;

public class AnimalActivity {

    public static void main(String arg[]) {

        //TODO: Use interfaces to declare identifiers instead of the actual classes
        Animal cat = new Cat();
        //TODO: Create Dog using interface Animal
        Animal dog = new Dog();


        Mammal mammal1 = new Mammal("Flexy");
        Mammal mammal2 = new Mammal("Roxy");


        //TODO: For mammal set animal to cat
        mammal1.setAnimal(cat);
        //TODO: execute for mammal animalIsSleeping()
        mammal1.animalIsSleeping();
        //TODO: execute for mammal animalIsSpeaking()
        mammal1.animalIsSpeaking();
        //TODO: For mammal set animal to dog
        mammal2.setAnimal(dog);
        //TODO: execute for mammal animalIsSleeping()
        mammal2.animalIsSleeping();
        //TODO: execute for mammal animalIsSpeaking()
        mammal2.animalIsSpeaking();
    }
}
