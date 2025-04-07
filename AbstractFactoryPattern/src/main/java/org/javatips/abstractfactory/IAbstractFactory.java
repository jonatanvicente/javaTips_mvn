package org.javatips.abstractfactory;

public interface IAbstractFactory {
    IShape createShape();
}

class CircleFactory implements IAbstractFactory {
    @Override
    public IShape createShape() {
        return new Circle();
    }
}

class SquareFactory implements IAbstractFactory {
    @Override
    public IShape createShape() {
        return new Square();
    }
}

class RectangleFactory implements IAbstractFactory {
    @Override
    public IShape createShape() {
        return new Rectangle();
    }
}
