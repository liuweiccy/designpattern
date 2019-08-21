package com.liuwei.designpattern.observer.example2;

import java.util.Observable;

/**
 * @author liuwei2
 */
public class ConcreteObserable extends Observable {
    @Override
    public synchronized void setChanged() {
        super.setChanged();
    }

    @Override
    public synchronized void clearChanged() {
        super.clearChanged();
    }
}
