package com.liuwei.designpattern.strategy.example1;

import lombok.Setter;

public class MovieTicket {
    private double price;
    @Setter
    private Discount discount;

    public MovieTicket(double price) {
        this.price = price;
    }

    public double getPrice() {
        return discount.calculate(price);
    }
}
