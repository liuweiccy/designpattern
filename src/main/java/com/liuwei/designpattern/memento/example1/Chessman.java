package com.liuwei.designpattern.memento.example1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author liuwei2
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Chessman {

    private String label;
    private int x;
    private int y;

    public ChessmanMemento save() {
        return new ChessmanMemento(this);
    }

    public void restore(ChessmanMemento memento) {
        this.label = memento.getLabel();
        this.x = memento.getX();
        this.y = memento.getY();
    }

    public void display() {
        System.out.println(toString());
    }
}
