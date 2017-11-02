package com.liuwei.designpattern.state.example2;

/**
 * @author liuwei2
 */
public abstract class State {
    public abstract void on(Switch s);
    public abstract void off(Switch s);
}
