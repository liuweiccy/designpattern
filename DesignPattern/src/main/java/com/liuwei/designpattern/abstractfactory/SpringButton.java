package com.liuwei.designpattern.abstractfactory;

public class SpringButton implements Button {
    @Override
    public void display() {
        System.out.println("显示Spring按钮");
    }
}
