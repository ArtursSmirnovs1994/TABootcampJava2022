package sef.module6.activity;

public class AnimalActivity {

    public static void main(String arg[]) {

        //TODO: Use interfaces to declare identifiers instead of the actual classes
        Animal cat = new Cat();
        //TODO: Create Dog using interface Animal
        Animal dog = new Dog();

        Mammal mammal = new Mammal("Kukusik");

        //TODO: For mammal set animal to cat
        mammal.setAnimal(cat);
        //TODO: execute for mammal animalIsSleeping()
        mammal.animalIsSleeping();

        //TODO: execute for mammal animalIsSpeaking()
        mammal.animalIsSpeaking();

        //TODO: For mammal set animal to dog
        mammal.setAnimal(dog);

        //TODO: execute for mammal animalIsSleeping()
        mammal.animalIsSleeping();
        //TODO: execute for mammal animalIsSpeaking()
        mammal.animalIsSpeaking();
    }
}
