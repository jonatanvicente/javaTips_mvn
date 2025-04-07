package org.javatips.abstractfactory;

public class Main {
    public static void main(String[] args) {
        IAbstractFactory circleFactory = FactoryProducer.getFactory("CIRCLE");
        IShape circle = circleFactory.createShape();
        circle.draw();

        IAbstractFactory squareFactory = FactoryProducer.getFactory("SQUARE");
        IShape square = squareFactory.createShape();
        square.draw();

        IAbstractFactory rectangleFactory = FactoryProducer.getFactory("RECTANGLE");
        IShape rectangle = rectangleFactory.createShape();
        rectangle.draw();
    }
}
