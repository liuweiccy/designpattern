package com.liuwei.designpattern.staticfactorymethod.graph;

public class Triangle implements Graph {
    public void draw() {
        System.out.println("绘制三角形");
    }

    public void erase() {
        System.out.println("擦除三角形");
    }
}
