package com.DesignPattern.AbstractFactoryPattern;

public class ColorFactory extends AbstractFactory{
    @Override
    Shape getShape(Class<? extends Shape> clazz) {
        return null;
    }

    @Override
    public Color getColor(Class<? extends Color> clazz) {
        Object obj = null;
        try {
            obj = Class.forName(clazz.getName()).newInstance();
        } catch (ClassNotFoundException e) {

        } catch (InstantiationException e) {

        } catch (IllegalAccessException e) {

        }
        return (Color)obj;
    }
}
