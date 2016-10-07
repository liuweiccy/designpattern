package com.liuwei.designpattern.prototypemanager;

public class PPR implements OfficialDocument {
    @Override
    public void display() {
        System.out.println("项目进展报告");
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
