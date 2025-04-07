package org.javatips.factorymethod;

public interface IAnimal {
    void speak();
}

class Dog implements IAnimal {
    @Override
    public void speak() {
        System.out.println("Guau!!!");
    }
}

class Cat implements IAnimal {
    @Override
    public void speak() {
        System.out.println("Miau!!");
    }
}