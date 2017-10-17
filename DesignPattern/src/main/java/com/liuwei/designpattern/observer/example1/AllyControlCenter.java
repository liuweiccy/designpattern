package com.liuwei.designpattern.observer.example1;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuwei2
 */
public abstract class AllyControlCenter {
    @Getter
    private String allyName;

    public AllyControlCenter(String allyName) {
        System.out.println(allyName + "战队成立");
        this.allyName = allyName;
    }

    protected List<Observer> players = new ArrayList<>(16);

    public void join(Observer obs) {
        System.out.println("玩家" + obs.getName() + "加入战队" + getAllyName());
        players.add(obs);
    }

    public void quit(Observer obs) {
        if (players.remove(obs)) {
            System.out.println("玩家" + obs.getName() + "退出战队" + getAllyName());
        }
    }

    public abstract void notifyObserver(String name);
}
