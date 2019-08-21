package com.liuwei.designpattern.decorator.example3;

public class MultiEncrypt extends Decorator {

    public MultiEncrypt(String content, MyChar myChar) {
        super(content, myChar);
    }

    @Override
    public void display() {
        System.out.println("进行复杂加密");
        super.display();
    }
}
