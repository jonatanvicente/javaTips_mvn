package org.javatips.factorymethod;

public abstract class AnimalFactory {
    public abstract IAnimal createAnimal();
}

class DogFactory extends AnimalFactory {
    @Override
    public IAnimal createAnimal() {
        return new Dog();
    }
}

class CatFactory extends AnimalFactory {
    @Override
    public IAnimal createAnimal() {
        return new Cat();
    }
}
