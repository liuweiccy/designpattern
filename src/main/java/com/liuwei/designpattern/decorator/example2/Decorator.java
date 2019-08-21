package com.liuwei.designpattern.decorator.example2;

public class Decorator extends Document {
    private Document document;

    public Decorator(Document document) {
        this.document = document;
    }

    @Override
    public void display() {
        document.display();
    }
}
