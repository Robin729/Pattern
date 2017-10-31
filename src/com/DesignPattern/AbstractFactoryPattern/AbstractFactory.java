package com.DesignPattern.AbstractFactoryPattern;

public abstract class AbstractFactory {
    abstract Color getColor(Class<? extends Color> clazz);
    abstract Shape getShape(Class<? extends Shape> clazz);
}
