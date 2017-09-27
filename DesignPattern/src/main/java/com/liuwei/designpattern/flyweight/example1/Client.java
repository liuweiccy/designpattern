package com.liuwei.designpattern.flyweight.example1;

public class Client {

    public static void main(String[] args) {
        IgoChessmanFactory factory;
        IgoChessman white1, white2, black1, black2;

        factory = IgoChessmanFactory.getInstatce();

        white1 = factory.getIgoChessman("w");
        white2 = factory.getIgoChessman("w");

        if (white1 == white2) {
            System.out.println("通过享元模式获取相同的实体,白棋");
        }

        black1 = factory.getIgoChessman("b");
        black2 = factory.getIgoChessman("b");

        if (black1 == black2) {
            System.out.println("通过享元模式获取相同的实体,黑棋");
        }

        white1.display();
        white2.display();
        black1.display();
        black2.display();

    }
}
