package com.liuwei.designpattern.decorator.example3;

public class MyChar {

    private String content;

    public MyChar(String content) {
        this.content = content;
    }

    public void display() {
        System.out.println("字符串：" + this.content);
    }
}
