package com.DesignPattern.AbstractFactoryPattern;

public abstract class FactoryProducer {
    public static AbstractFactory getFactory(Class<? extends AbstractFactory> calzz) {
        Object obj = null;
        try {
            obj = Class.forName(calzz.getName()).newInstance();
        } catch (ClassNotFoundException e) {

        } catch (InstantiationException e) {

        } catch (IllegalAccessException e) {

        }
        return (AbstractFactory)obj;
    }
}
