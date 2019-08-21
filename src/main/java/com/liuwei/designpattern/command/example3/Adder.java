package com.liuwei.designpattern.command.example3;

public class Adder {
    private int num = 0;

    public int add(int value) {
        num += value;
        return num;
    }
}
