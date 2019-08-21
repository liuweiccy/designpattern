package com.liuwei.designpattern.observer.jvm;

import java.util.Observable;

/**
 * ....
 *
 * @author Eric Liu
 * @date 2019/08/21 23:29
 */
public class Client {
    public static void main(String[] args) {
        Observable observable = new Observable();

        MyObserver observer = new MyObserver("VV", observable);

        observable.hasChanged();
        observable.notifyObservers();
    }
}
