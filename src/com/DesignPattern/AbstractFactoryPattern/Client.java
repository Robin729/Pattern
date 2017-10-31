package com.DesignPattern.AbstractFactoryPattern;

public class Client {
    public static void main(String[] args) {
        AbstractFactory colorFactory = FactoryProducer.getFactory(ColorFactory.class);
        Color red = colorFactory.getColor(Red.class);
        Color green = colorFactory.getColor(Green.class);
        red.fill();
        green.fill();
        AbstractFactory shapeFactory = FactoryProducer.getFactory(ShapeFactory.class);
        Shape rectangle = shapeFactory.getShape(Rectangle.class);
        Shape square = shapeFactory.getShape(Square.class);
        rectangle.draw();
        square.draw();
    }
}
