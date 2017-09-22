package com.liuwei.designpattern.decorator.example1;

public class Client {
    public static void main(String[] args) {
        Component component, componentSB;
        component = new Windows();
        componentSB = new ScrollBaeDecorator(component);
        componentSB.display();

        System.out.println("--------------------------------");

        Component component1, componentSB1, componentBB1;

        component1 = new TextBox();
        componentSB1 = new ScrollBaeDecorator(component1);
        componentBB1 = new BlackBorderDecorator(componentSB1);

        componentBB1.display();
    }
}
