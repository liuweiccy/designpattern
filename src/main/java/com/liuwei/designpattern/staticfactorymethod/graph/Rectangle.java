package com.liuwei.designpattern.staticfactorymethod.graph;

public class Rectangle implements Graph {
    @Override
    public void draw() {
        System.out.println("绘制长方形");
    }

    @Override
    public void erase() {
        System.out.println("擦除长方形");
    }
}
