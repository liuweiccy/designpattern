package com.liuwei.designpattern.staticfactorymethod;

public class LineChart implements Chart{

    public LineChart() {
        System.out.println("创建LineChart图");
    }

    @Override
    public void display() {
        System.out.println("显示LineChart图");
    }
}
