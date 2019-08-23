package com.liuwei.designpattern.observer.jvm;

import java.util.Observable;
import java.util.Observer;

/**
 * 基于JVM的观察者模式
 *
 * @author Eric Liu
 * @date 2019/08/21 23:18
 */
public class Sub implements Observer {
    private String name;

    public Sub(String name, Pub pub) {
        this.name = name;
        pub.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.printf("%s:收到观察者消息:%s\n", name, arg);
    }
}
