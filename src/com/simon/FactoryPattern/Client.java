package com.simon.FactoryPattern;

public class Client {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getClass(Circle.class);
        Shape square = ShapeFactory.getClass(Square.class);
        circle.draw();
        square.draw();
    }
}
