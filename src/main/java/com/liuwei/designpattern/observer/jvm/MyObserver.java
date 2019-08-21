package com.liuwei.designpattern.observer.jvm;

import lombok.Getter;

import java.util.Observable;
import java.util.Observer;

/**
 * 基于JVM的观察者模式
 *
 * @author Eric Liu
 * @date 2019/08/21 23:18
 */
public class MyObserver implements Observer {
    @Getter
    private String name;

    public MyObserver(String name, Observable observable) {
        this.name = name;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("收到观察者消息");
    }
}
