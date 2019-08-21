package com.liuwei.designpattern.prototypemanager;

public class FAR implements OfficialDocument {
    @Override
    public void display() {

    }

    @Override
    public OfficialDocument clone() {
        try {
            return (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
