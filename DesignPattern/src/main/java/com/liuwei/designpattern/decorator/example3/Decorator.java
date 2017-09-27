package com.liuwei.designpattern.decorator.example3;

public abstract class Decorator extends MyChar {

    private MyChar myChar;

    public Decorator(String content, MyChar myChar) {
        super(content);
        this.myChar = myChar;
    }

    @Override
    public void display() {
        myChar.display();
    }
}
