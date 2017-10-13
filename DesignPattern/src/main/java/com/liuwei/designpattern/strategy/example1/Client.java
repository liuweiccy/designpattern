package com.liuwei.designpattern.strategy.example1;

public class Client {

    public static void main(String[] args) {
        Discount discount = new StudentDiscount();

        MovieTicket mt = new MovieTicket(80);
        mt.setDiscount(discount);

        System.out.println("票价原价为：" + 80);
        System.out.println("票价打折为：" + mt.getPrice());
    }
}
