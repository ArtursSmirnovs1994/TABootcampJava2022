package sef.module6.activity;

public class AnimalActivity {

    public static void main(String arg[]) {

        //TODO: Use interfaces to declare identifiers instead of the actual classes
        Animal cat = new Cat();
        //TODO: Create Dog using interface Animal
        Animal dog = new Dog();



        Mammal mammalCat = new Mammal("Fluffy");
        Mammal mammalDog = new Mammal("Rex");

        //TODO: For mammal set animal to cat
        mammalCat.setAnimal(cat);

        //TODO: execute for mammal animalIsSleeping()
        mammalCat.animalIsSleeping();

        //TODO: execute for mammal animalIsSpeaking()
        mammalCat.animalIsSpeaking();

        //TODO: For mammal set animal to dog
        mammalDog.setAnimal(dog);

        //TODO: execute for mammal animalIsSleeping()
        mammalDog.animalIsSleeping();

        //TODO: execute for mammal animalIsSpeaking()
        mammalDog.animalIsSpeaking();

    }
}
