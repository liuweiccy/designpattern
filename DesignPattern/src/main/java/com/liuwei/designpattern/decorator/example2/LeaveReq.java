package com.liuwei.designpattern.decorator.example2;

import lombok.Getter;

public class LeaveReq extends Document {
    @Getter
    private String name;

    public LeaveReq(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("请假单：" + name);
    }
}
