package org.javatips.factorymethod;

public class Main {
    public static void main(String[] args) {
        AnimalFactory dogFactory = new DogFactory();
        IAnimal dog = dogFactory.createAnimal();
        dog.speak();

        AnimalFactory catFactory = new CatFactory();
        IAnimal cat = catFactory.createAnimal();
        cat.speak();
    }
}