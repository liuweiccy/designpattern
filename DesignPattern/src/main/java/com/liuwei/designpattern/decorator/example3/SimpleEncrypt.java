package com.liuwei.designpattern.decorator.example3;

public class SimpleEncrypt extends Decorator {

    public SimpleEncrypt(String content, MyChar myChar) {
        super(content, myChar);
    }

    @Override
    public void display() {
        System.out.println("进行简单加密");
        super.display();
    }
}
