package sef.module6.activity;

public class AnimalActivity {

    public static void main(String[] args) {

        // Use interfaces to declare identifiers instead of the actual classes
        Animal cat = new Cat();
        // Create Dog using interface Animal
        Animal dog = new Dog();

        Mammal mammal = new Mammal("Flexy");

        // For mammal set animal to cat
        mammal.setAnimal(cat);

        // execute for mammal animalIsSleeping()
        mammal.animalIsSleeping();

        // execute for mammal animalIsSpeaking()
        mammal.animalIsSpeaking();

        // For mammal set animal to dog
        mammal.setAnimal(dog);

        // execute for mammal animalIsSleeping()
        mammal.animalIsSleeping();

        // execute for mammal animalIsSpeaking()
        mammal.animalIsSpeaking();
    }
}
