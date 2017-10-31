package com.DesignPattern.AbstractFactoryPattern;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(Class<? extends Shape> clazz) {
        Object obj = null;
        try {
            obj = Class.forName(clazz.getName()).newInstance();
        } catch (ClassNotFoundException e) {

        } catch (InstantiationException e) {

        } catch (IllegalAccessException e) {

        }
        return (Shape)obj;
    }

    @Override
    Color getColor(Class<? extends Color> clazz) {
        return null;
    }
}
