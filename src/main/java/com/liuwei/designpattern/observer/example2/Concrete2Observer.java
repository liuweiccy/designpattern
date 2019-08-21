package com.liuwei.designpattern.observer.example2;

import java.util.Observable;
import java.util.Observer;

/**
 * @author liuwei2
 */
public class Concrete2Observer implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Concrete2Observer执行");
    }
}
