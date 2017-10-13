package com.liuwei.designpattern.strategy.example1;

public class VIPDiscount extends Discount {
    @Override
    public double calculate(double price) {
        System.out.println("VIP：");
        return price*0.5;
    }
}
