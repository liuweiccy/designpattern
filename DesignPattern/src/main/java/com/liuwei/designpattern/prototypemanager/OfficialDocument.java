package com.liuwei.designpattern.prototypemanager;

public interface OfficialDocument extends Cloneable {
    void display();
    OfficialDocument clone();
}
