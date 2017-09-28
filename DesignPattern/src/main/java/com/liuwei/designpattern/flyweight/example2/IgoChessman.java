package com.liuwei.designpattern.flyweight.example2;

public abstract class IgoChessman {

    abstract String getColor();

    public void display(Position position) {
        System.out.println("棋子的颜色为：" + getColor() + ",位置为：" + position);
    }
}
