package com.liuwei.designpattern.decorator.examplebase;

public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Decorator decorator = new ConcreteDecorator(component);
        decorator.operation();
    }
}
