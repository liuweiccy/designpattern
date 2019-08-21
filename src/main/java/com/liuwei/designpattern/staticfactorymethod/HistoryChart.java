package com.liuwei.designpattern.staticfactorymethod;

public class HistoryChart implements Chart{

    public HistoryChart() {
        System.out.println("创建HistoryChart图");
    }

    @Override
    public void display() {
        System.out.println("显示HistoryChart图");
    }
}
