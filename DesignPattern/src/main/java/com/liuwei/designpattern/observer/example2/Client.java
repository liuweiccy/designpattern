package com.liuwei.designpattern.observer.example2;

/**
 * @author liuwei2
 *
 * 使用JDK自带的Observer
 */
public class Client {

    public static void main(String[] args) {
        ConcreteObserable observable = new ConcreteObserable();
        observable.addObserver(new Concrete1Observer());
        observable.addObserver(new Concrete2Observer());
        observable.addObserver(new Concrete3Observer());

        observable.setChanged();
        observable.notifyObservers();
        observable.notifyObservers();
    }
}
