package com.liuwei.designpattern.staticfactorymethod;

public class Factory {

    public static Product getProduct(String arg) {
        Product product = null;
        if ("A".equalsIgnoreCase(arg)) {
            product = new ConcreteProductA();
        } else if ("B".equalsIgnoreCase(arg)) {
            product = new ConcreteProductB();
        }
        return product;
    }
}
