package org.javatips.abstractfactory;

public interface IShape {
    void draw();
}

class Circle implements IShape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Square implements IShape {
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
}

class Rectangle implements IShape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
