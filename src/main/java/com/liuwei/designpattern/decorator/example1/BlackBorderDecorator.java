package com.liuwei.designpattern.decorator.example1;

public class BlackBorderDecorator extends ComponentDecorator {

    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        setBlackDecorator();
        super.display();
    }

    public void setBlackDecorator() {
        System.out.println("设置黑边框");
    }
}
