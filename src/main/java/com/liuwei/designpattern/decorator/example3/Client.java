package com.liuwei.designpattern.decorator.example3;

public class Client {


    // 该装饰，这模式没有抽象构建，存在扩展的问题
    public static void main(String[] args) {

        MyChar myChar = new MyChar("I Love U");

        MyChar decorator1, decorator2;

        decorator1 = new SimpleEncrypt("", myChar);

        decorator2 = new MultiEncrypt("", decorator1);

        decorator2.display();
    }
}
