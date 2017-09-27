package com.liuwei.designpattern.flyweight.example1;

public abstract class IgoChessman {

    abstract String getColor();

    public void display() {
        System.out.println("棋子的颜色为：" + getColor());
    }
}
