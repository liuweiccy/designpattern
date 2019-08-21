package com.liuwei.designpattern.composite.example1;

public abstract class Component {
    public abstract void add(Component component);
    public abstract Component getChild(int i);
    public abstract void killVirus();
}
