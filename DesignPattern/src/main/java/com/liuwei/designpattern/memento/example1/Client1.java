package com.liuwei.designpattern.memento.example1;

/**
 * @author liuwei2
 */
public class Client1 {

    public static void main(String[] args) {
        MementoCaretaker caretaker = new MementoCaretaker();

        Chessman chessman = new Chessman("车", 1, 1);
        chessman.display();
        caretaker.setMemento(chessman.save());

        chessman.setY(4);
        chessman.display();

        System.out.println("********悔棋********");
        chessman.restore(caretaker.getMemento());
        chessman.display();

    }
}
