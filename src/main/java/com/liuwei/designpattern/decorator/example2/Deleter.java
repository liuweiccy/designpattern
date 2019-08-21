package com.liuwei.designpattern.decorator.example2;

public class Deleter extends Decorator {

    private Document document;

    public Deleter(Document document) {
        super(document);
    }

    public void doDelete() {
        System.out.println("进行删除");
    }

    @Override
    public void display() {
        super.display();
        doDelete();
    }
}
