package com.liuwei.designpattern.observer.example1;

import lombok.Getter;
import lombok.Setter;

/**
 * @author liuwei2
 */
public class Player implements Observer {
    @Setter
    @Getter
    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void help() {
        System.out.println("坚持住，" + getName() + "来救你！");
    }

    @Override
    public void beAttacked(AllyControlCenter acc) {
        System.out.println(getName() + "被攻击！");
        acc.notifyObserver(getName());
    }
}
