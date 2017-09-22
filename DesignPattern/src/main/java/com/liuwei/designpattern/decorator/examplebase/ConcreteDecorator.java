package com.liuwei.designpattern.decorator.examplebase;

public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        addedBhavior();
        super.operation();
    }

    public void addedBhavior() {
        System.out.println("添加其他行为操作");
    }
}
