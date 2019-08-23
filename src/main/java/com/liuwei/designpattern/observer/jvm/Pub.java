package com.liuwei.designpattern.observer.jvm;

import java.util.Observable;

/**
 * 基于JVM的观察者模式的Pub者
 * @author liuwei2
 * @date 2019/08/22 17:20
 */
public class Pub extends Observable {
    private String msg;

    public void setMsg(String msg) {
        if (msg.equals(this.msg)) {
            return;
        }

        setChanged();
        notifyObservers(msg);
    }
}
