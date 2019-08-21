package com.liuwei.designpattern.strategy.example1;

public class StudentDiscount extends Discount {
    @Override
    public double calculate(double price) {
        System.out.println("学生票：");
        return price*0.8;
    }
}
