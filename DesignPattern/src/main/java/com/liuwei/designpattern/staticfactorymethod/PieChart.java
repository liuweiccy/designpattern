package com.liuwei.designpattern.staticfactorymethod;

public class PieChart implements Chart{

    public PieChart() {
        System.out.println("创建PieChart图");
    }

    public void display() {
        System.out.println("显示PieChart图");
    }
}
