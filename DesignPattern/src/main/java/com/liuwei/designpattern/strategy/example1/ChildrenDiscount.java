package com.liuwei.designpattern.strategy.example1;

public class ChildrenDiscount extends Discount {
    @Override
    public double calculate(double price) {
        System.out.println("儿童：");
        return price - 10;
    }
}
