package org.javatips.abstractfactory;

public class FactoryProducer {
    public static IAbstractFactory getFactory(String shapeType) {
        switch (shapeType) {
            case "CIRCLE":
                return new CircleFactory();
            case "SQUARE":
                return new SquareFactory();
            case "RECTANGLE":
                return new RectangleFactory();
            default:
                throw new IllegalArgumentException("Unknown shape type");
        }
    }
}