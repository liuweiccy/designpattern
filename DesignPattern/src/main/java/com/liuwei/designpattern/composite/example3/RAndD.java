package com.liuwei.designpattern.composite.example3;

import lombok.Getter;

public class RAndD extends AbstractCompany{

    @Getter
    private String name;

    public RAndD(String name) {
        this.name = name;
    }

    @Override
    public void notice() {
        System.out.println("----" + name + "收到通知");
    }

    @Override
    public void add(AbstractCompany abstractCompany) {
        throw new RuntimeException("不支持改方法");
    }
}
