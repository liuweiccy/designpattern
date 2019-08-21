package com.liuwei.designpattern.flyweight.example2;

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

        white1.display(new Position(1,2));
        white2.display(new Position(3,4));
        black1.display(new Position(5,6));
        black2.display(new Position(7,8));
    }
}
