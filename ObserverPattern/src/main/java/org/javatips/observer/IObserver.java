package org.javatips.observer;

public interface IObserver {
    void update(String message);
}

class ConcreteObserver implements IObserver {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received message: " + message);
    }
}