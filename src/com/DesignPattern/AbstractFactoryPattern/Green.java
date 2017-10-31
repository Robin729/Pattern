package com.DesignPattern.AbstractFactoryPattern;

import java.util.Collections;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Green");
    }
}
