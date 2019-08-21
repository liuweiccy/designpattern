package com.liuwei.designpattern.strategy.example1;

/**
 * @author liuwei2
 */
public class Client {

    public static void main(String[] args) {
        Discount discount = new StudentDiscount();

        MovieTicket mt = new MovieTicket(80);
        mt.setDiscount(discount);

        MovieTicket mt1 = new MovieTicket(80);
        mt1.setDiscount(new VIPDiscount());

        System.out.println("票价原价为：" + 80);
        System.out.println("票价打折为：" + mt.getPrice());
        System.out.println("票价打折为：" + mt1.getPrice());
    }
}
