package com.liuwei.designpattern.prototype;

public class Client {
    public static void main(String[] args) {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setAttr("dfa");
        ConcretePrototype concretePrototype1 = concretePrototype.clone();
        ConcretePrototype concretePrototype2 = concretePrototype;
        System.out.println(concretePrototype == concretePrototype1);
        System.out.println(concretePrototype == concretePrototype2);
    }
}
