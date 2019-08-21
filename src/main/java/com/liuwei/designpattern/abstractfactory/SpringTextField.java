package com.liuwei.designpattern.abstractfactory;

public class SpringTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示Spring文本框");
    }
}
