package com.liuwei.designpattern.prototype;

public class ConcretePrototype implements Prototype {
    private String attr;

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    @Override
    public ConcretePrototype clone() {
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setAttr(this.getAttr());
        return prototype;
    }
}
