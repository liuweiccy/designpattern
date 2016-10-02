package com.liuwei.designpattern.staticfactorymethod.graph;

public class Circle implements Graph {
    public void draw() {
        System.out.println("绘制圆形");
    }

    public void erase() {
        System.out.println("擦除圆形");
    }
}
