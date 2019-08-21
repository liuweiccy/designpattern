package com.liuwei.designpattern.prototypemanager;

public class SRS implements OfficialDocument {
    @Override
    public void display() {
        System.out.println("软件需求规格报告");
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
