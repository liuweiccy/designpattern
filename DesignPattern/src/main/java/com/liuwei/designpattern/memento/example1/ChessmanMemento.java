package com.liuwei.designpattern.memento.example1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author liuwei2
 */
@Getter
@Setter
@ToString
class ChessmanMemento {
    private String label;
    private int x;
    private int y;

    public ChessmanMemento(Chessman chessman) {
        this.label = chessman.getLabel();
        this.x = chessman.getX();
        this.y = chessman.getY();
    }
}
