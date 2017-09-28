package com.liuwei.designpattern.flyweight.example2;

import java.util.Hashtable;

public class IgoChessmanFactory {

    private final static IgoChessmanFactory instatce = new IgoChessmanFactory();

    private final Hashtable<String, IgoChessman> chessmanHashtable;

    private IgoChessmanFactory() {
        chessmanHashtable = new Hashtable<>();
        IgoChessman white, black;
        white = new WhiteChessman();
        black = new BlackChessman();

        chessmanHashtable.put("b", black);
        chessmanHashtable.put("w", white);
    }

    public static IgoChessmanFactory getInstatce() {
        return instatce;
    }

    public IgoChessman getIgoChessman(String color) {
        return chessmanHashtable.get(color);
    }
}
